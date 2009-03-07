package scrum.client.sprint;

import ilarkesto.gwt.client.ARichtextViewEditWidget;
import ilarkesto.gwt.client.ATextViewEditWidget;
import ilarkesto.gwt.client.AWidget;
import scrum.client.ScrumGwtApplication;
import scrum.client.common.BlockListWidget;
import scrum.client.common.FieldsWidget;
import scrum.client.common.GroupWidget;
import scrum.client.project.Project;
import scrum.client.project.Requirement;
import scrum.client.workspace.WorkareaWidget;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class SprintBacklogWidget extends AWidget {

	private BlockListWidget<Requirement> requirementList;
	private FlowPanel view;
	private Label remainingWork;
	private Label begin;
	private Label end;

	private FieldsWidget fieldsWidget;

	@Override
	protected Widget onInitialization() {

		remainingWork = new Label();
		begin = new Label();
		end = new Label();
		requirementList = new BlockListWidget<Requirement>(RequirementInSprintWidget.class);

		view = new FlowPanel();
		fieldsWidget = new FieldsWidget();

		fieldsWidget.add("Label", new ATextViewEditWidget() {

			@Override
			protected void onViewerUpdate() {
				if (getSprint() != null) setViewerText(getSprint().getLabel());
			}

			@Override
			protected void onEditorUpdate() {
				setEditorText(getSprint().getLabel());
			}

			@Override
			protected void onEditorSubmit() {
				getSprint().setLabel(getEditorText());
			}
		});

		fieldsWidget.add("Goal", new ARichtextViewEditWidget() {

			@Override
			protected void onViewerUpdate() {
				if (getSprint() != null) setViewerText(getSprint().getGoal());
			}

			@Override
			protected void onEditorUpdate() {
				setEditorText(getSprint().getGoal());
			}

			@Override
			protected void onEditorSubmit() {
				getSprint().setGoal(getEditorText());
			}
		});
		fieldsWidget.add("Begin", begin);
		fieldsWidget.add("End", end);
		fieldsWidget.add("Remaining Work", remainingWork);
		view.add(fieldsWidget);
		view.add(requirementList);

		return new GroupWidget("Sprint Backlog", view);
	}

	@Override
	protected void onUpdate() {
		fieldsWidget.update();

		remainingWork.setText(getSprint().getTaskEffortSumString());
		begin.setText(getSprint().getBegin().toString());
		end.setText(getSprint().getEnd().toString());

		requirementList.setBlocks(getSprint().getRequirements());
	}

	public void selectRequirement(Requirement r) {
		update();

		requirementList.selectObject(r);
		requirementList.scrollToSelectedBlock();
	}

	private Sprint getSprint() {
		Project project = ScrumGwtApplication.get().getProject();
		if (project == null) return null;
		return project.getCurrentSprint();
	}

	class AssignSprintListener implements ClickListener {

		public void onClick(Widget sender) {
			update();
		}
	}

	public static SprintBacklogWidget get() {
		return WorkareaWidget.get().getSprintBacklog();
	}

}
