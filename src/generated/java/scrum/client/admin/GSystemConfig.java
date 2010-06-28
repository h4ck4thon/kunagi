// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtEntityGenerator










package scrum.client.admin;

import java.util.*;
import ilarkesto.persistence.*;
import ilarkesto.core.logging.Log;
import ilarkesto.base.*;
import ilarkesto.base.time.*;
import ilarkesto.auth.*;
import scrum.client.common.*;
import ilarkesto.gwt.client.*;

public abstract class GSystemConfig
            extends scrum.client.common.AScrumGwtEntity {

    protected scrum.client.Dao getDao() {
        return scrum.client.Dao.get();
    }

    public GSystemConfig() {
    }

    public GSystemConfig(Map data) {
        super(data);
        updateProperties(data);
    }

    public static final String ENTITY_TYPE = "systemConfig";

    @Override
    public final String getEntityType() {
        return ENTITY_TYPE;
    }

    // --- googleAnalyticsId ---

    private java.lang.String googleAnalyticsId ;

    public final java.lang.String getGoogleAnalyticsId() {
        return this.googleAnalyticsId ;
    }

    public final SystemConfig setGoogleAnalyticsId(java.lang.String googleAnalyticsId) {
        if (isGoogleAnalyticsId(googleAnalyticsId)) return (SystemConfig)this;
        this.googleAnalyticsId = googleAnalyticsId ;
        propertyChanged("googleAnalyticsId", this.googleAnalyticsId);
        return (SystemConfig)this;
    }

    public final boolean isGoogleAnalyticsId(java.lang.String googleAnalyticsId) {
        return equals(this.googleAnalyticsId, googleAnalyticsId);
    }

    private transient GoogleAnalyticsIdModel googleAnalyticsIdModel;

    public GoogleAnalyticsIdModel getGoogleAnalyticsIdModel() {
        if (googleAnalyticsIdModel == null) googleAnalyticsIdModel = createGoogleAnalyticsIdModel();
        return googleAnalyticsIdModel;
    }

    protected GoogleAnalyticsIdModel createGoogleAnalyticsIdModel() { return new GoogleAnalyticsIdModel(); }

    protected class GoogleAnalyticsIdModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public java.lang.String getValue() {
            return getGoogleAnalyticsId();
        }

        @Override
        public void setValue(java.lang.String value) {
            setGoogleAnalyticsId(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- smtpServer ---

    private java.lang.String smtpServer ;

    public final java.lang.String getSmtpServer() {
        return this.smtpServer ;
    }

    public final SystemConfig setSmtpServer(java.lang.String smtpServer) {
        if (isSmtpServer(smtpServer)) return (SystemConfig)this;
        this.smtpServer = smtpServer ;
        propertyChanged("smtpServer", this.smtpServer);
        return (SystemConfig)this;
    }

    public final boolean isSmtpServer(java.lang.String smtpServer) {
        return equals(this.smtpServer, smtpServer);
    }

    private transient SmtpServerModel smtpServerModel;

    public SmtpServerModel getSmtpServerModel() {
        if (smtpServerModel == null) smtpServerModel = createSmtpServerModel();
        return smtpServerModel;
    }

    protected SmtpServerModel createSmtpServerModel() { return new SmtpServerModel(); }

    protected class SmtpServerModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public java.lang.String getValue() {
            return getSmtpServer();
        }

        @Override
        public void setValue(java.lang.String value) {
            setSmtpServer(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- smtpUser ---

    private java.lang.String smtpUser ;

    public final java.lang.String getSmtpUser() {
        return this.smtpUser ;
    }

    public final SystemConfig setSmtpUser(java.lang.String smtpUser) {
        if (isSmtpUser(smtpUser)) return (SystemConfig)this;
        this.smtpUser = smtpUser ;
        propertyChanged("smtpUser", this.smtpUser);
        return (SystemConfig)this;
    }

    public final boolean isSmtpUser(java.lang.String smtpUser) {
        return equals(this.smtpUser, smtpUser);
    }

    private transient SmtpUserModel smtpUserModel;

    public SmtpUserModel getSmtpUserModel() {
        if (smtpUserModel == null) smtpUserModel = createSmtpUserModel();
        return smtpUserModel;
    }

    protected SmtpUserModel createSmtpUserModel() { return new SmtpUserModel(); }

    protected class SmtpUserModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public java.lang.String getValue() {
            return getSmtpUser();
        }

        @Override
        public void setValue(java.lang.String value) {
            setSmtpUser(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- smtpPassword ---

    private java.lang.String smtpPassword ;

    public final java.lang.String getSmtpPassword() {
        return this.smtpPassword ;
    }

    public final SystemConfig setSmtpPassword(java.lang.String smtpPassword) {
        if (isSmtpPassword(smtpPassword)) return (SystemConfig)this;
        this.smtpPassword = smtpPassword ;
        propertyChanged("smtpPassword", this.smtpPassword);
        return (SystemConfig)this;
    }

    public final boolean isSmtpPassword(java.lang.String smtpPassword) {
        return equals(this.smtpPassword, smtpPassword);
    }

    private transient SmtpPasswordModel smtpPasswordModel;

    public SmtpPasswordModel getSmtpPasswordModel() {
        if (smtpPasswordModel == null) smtpPasswordModel = createSmtpPasswordModel();
        return smtpPasswordModel;
    }

    protected SmtpPasswordModel createSmtpPasswordModel() { return new SmtpPasswordModel(); }

    protected class SmtpPasswordModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public java.lang.String getValue() {
            return getSmtpPassword();
        }

        @Override
        public void setValue(java.lang.String value) {
            setSmtpPassword(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- update properties by map ---

    public void updateProperties(Map props) {
        googleAnalyticsId  = (java.lang.String) props.get("googleAnalyticsId");
        smtpServer  = (java.lang.String) props.get("smtpServer");
        smtpUser  = (java.lang.String) props.get("smtpUser");
        smtpPassword  = (java.lang.String) props.get("smtpPassword");
    }

    @Override
    public void storeProperties(Map properties) {
        super.storeProperties(properties);
        properties.put("googleAnalyticsId", this.googleAnalyticsId);
        properties.put("smtpServer", this.smtpServer);
        properties.put("smtpUser", this.smtpUser);
        properties.put("smtpPassword", this.smtpPassword);
    }

}