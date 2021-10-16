package pqt.dss.illustration.model.eo;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.sql.Types;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.DBTransaction;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Oct 04 14:35:14 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DssIllustrationHdImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        HdIdPk,
        PlanName,
        MembershipNo,
        AgentNoFk,
        DateOfBirth,
        UserIdFk,
        EnterDate,
        LastUpdatedBy,
        LastUpdatedDate,
        ReasonSpecial,
        BranchStatus,
        DssStatus,
        BranchNotifIdFk,
        DssNotifIdFk,
        IllustrationDocNo,
        BranchCodeFk,
        WorkflowNotificationId,
        WorkflowStatus,
        DssIllustrationCom,
        DssIllustrationSr,
        DssIllustrationDt,
        DssIllustrationRp;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int HDIDPK = AttributesEnum.HdIdPk.index();
    public static final int PLANNAME = AttributesEnum.PlanName.index();
    public static final int MEMBERSHIPNO = AttributesEnum.MembershipNo.index();
    public static final int AGENTNOFK = AttributesEnum.AgentNoFk.index();
    public static final int DATEOFBIRTH = AttributesEnum.DateOfBirth.index();
    public static final int USERIDFK = AttributesEnum.UserIdFk.index();
    public static final int ENTERDATE = AttributesEnum.EnterDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int REASONSPECIAL = AttributesEnum.ReasonSpecial.index();
    public static final int BRANCHSTATUS = AttributesEnum.BranchStatus.index();
    public static final int DSSSTATUS = AttributesEnum.DssStatus.index();
    public static final int BRANCHNOTIFIDFK = AttributesEnum.BranchNotifIdFk.index();
    public static final int DSSNOTIFIDFK = AttributesEnum.DssNotifIdFk.index();
    public static final int ILLUSTRATIONDOCNO = AttributesEnum.IllustrationDocNo.index();
    public static final int BRANCHCODEFK = AttributesEnum.BranchCodeFk.index();
    public static final int WORKFLOWNOTIFICATIONID = AttributesEnum.WorkflowNotificationId.index();
    public static final int WORKFLOWSTATUS = AttributesEnum.WorkflowStatus.index();
    public static final int DSSILLUSTRATIONCOM = AttributesEnum.DssIllustrationCom.index();
    public static final int DSSILLUSTRATIONSR = AttributesEnum.DssIllustrationSr.index();
    public static final int DSSILLUSTRATIONDT = AttributesEnum.DssIllustrationDt.index();
    public static final int DSSILLUSTRATIONRP = AttributesEnum.DssIllustrationRp.index();

    /**
     * This is the default constructor (do not remove).
     */
    public DssIllustrationHdImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("pqt.dss.illustration.model.eo.DssIllustrationHd");
    }


    /**
     * Gets the attribute value for HdIdPk, using the alias name HdIdPk.
     * @return the value of HdIdPk
     */
    public Number getHdIdPk() {
        return (Number) getAttributeInternal(HDIDPK);
    }

    /**
     * Sets <code>value</code> as the attribute value for HdIdPk.
     * @param value value to set the HdIdPk
     */
    public void setHdIdPk(Number value) {
        setAttributeInternal(HDIDPK, value);
    }

    /**
     * Gets the attribute value for PlanName, using the alias name PlanName.
     * @return the value of PlanName
     */
    public String getPlanName() {
        return (String) getAttributeInternal(PLANNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for PlanName.
     * @param value value to set the PlanName
     */
    public void setPlanName(String value) {
        setAttributeInternal(PLANNAME, value);
    }

    /**
     * Gets the attribute value for MembershipNo, using the alias name MembershipNo.
     * @return the value of MembershipNo
     */
    public Number getMembershipNo() {
        return (Number) getAttributeInternal(MEMBERSHIPNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for MembershipNo.
     * @param value value to set the MembershipNo
     */
    public void setMembershipNo(Number value) {
        setAttributeInternal(MEMBERSHIPNO, value);
    }

    /**
     * Gets the attribute value for AgentNoFk, using the alias name AgentNoFk.
     * @return the value of AgentNoFk
     */
    public Number getAgentNoFk() {
        return (Number) getAttributeInternal(AGENTNOFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for AgentNoFk.
     * @param value value to set the AgentNoFk
     */
    public void setAgentNoFk(Number value) {
        setAttributeInternal(AGENTNOFK, value);
    }

    /**
     * Gets the attribute value for DateOfBirth, using the alias name DateOfBirth.
     * @return the value of DateOfBirth
     */
    public Date getDateOfBirth() {
        return (Date) getAttributeInternal(DATEOFBIRTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateOfBirth.
     * @param value value to set the DateOfBirth
     */
    public void setDateOfBirth(Date value) {
        setAttributeInternal(DATEOFBIRTH, value);
    }

    /**
     * Gets the attribute value for UserIdFk, using the alias name UserIdFk.
     * @return the value of UserIdFk
     */
    public Number getUserIdFk() {
        return (Number) getAttributeInternal(USERIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for UserIdFk.
     * @param value value to set the UserIdFk
     */
    public void setUserIdFk(Number value) {
        setAttributeInternal(USERIDFK, value);
    }

    /**
     * Gets the attribute value for EnterDate, using the alias name EnterDate.
     * @return the value of EnterDate
     */
    public Date getEnterDate() {
        return (Date) getAttributeInternal(ENTERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EnterDate.
     * @param value value to set the EnterDate
     */
    public void setEnterDate(Date value) {
        setAttributeInternal(ENTERDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the value of LastUpdatedDate
     */
    public Date getLastUpdatedDate() {
        return (Date) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Date value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for ReasonSpecial, using the alias name ReasonSpecial.
     * @return the value of ReasonSpecial
     */
    public String getReasonSpecial() {
        return (String) getAttributeInternal(REASONSPECIAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for ReasonSpecial.
     * @param value value to set the ReasonSpecial
     */
    public void setReasonSpecial(String value) {
        setAttributeInternal(REASONSPECIAL, value);
    }

    /**
     * Gets the attribute value for BranchStatus, using the alias name BranchStatus.
     * @return the value of BranchStatus
     */
    public String getBranchStatus() {
        return (String) getAttributeInternal(BRANCHSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchStatus.
     * @param value value to set the BranchStatus
     */
    public void setBranchStatus(String value) {
        setAttributeInternal(BRANCHSTATUS, value);
    }

    /**
     * Gets the attribute value for DssStatus, using the alias name DssStatus.
     * @return the value of DssStatus
     */
    public String getDssStatus() {
        return (String) getAttributeInternal(DSSSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for DssStatus.
     * @param value value to set the DssStatus
     */
    public void setDssStatus(String value) {
        setAttributeInternal(DSSSTATUS, value);
    }

    /**
     * Gets the attribute value for BranchNotifIdFk, using the alias name BranchNotifIdFk.
     * @return the value of BranchNotifIdFk
     */
    public Number getBranchNotifIdFk() {
        return (Number) getAttributeInternal(BRANCHNOTIFIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchNotifIdFk.
     * @param value value to set the BranchNotifIdFk
     */
    public void setBranchNotifIdFk(Number value) {
        setAttributeInternal(BRANCHNOTIFIDFK, value);
    }

    /**
     * Gets the attribute value for DssNotifIdFk, using the alias name DssNotifIdFk.
     * @return the value of DssNotifIdFk
     */
    public Number getDssNotifIdFk() {
        return (Number) getAttributeInternal(DSSNOTIFIDFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for DssNotifIdFk.
     * @param value value to set the DssNotifIdFk
     */
    public void setDssNotifIdFk(Number value) {
        setAttributeInternal(DSSNOTIFIDFK, value);
    }

    /**
     * Gets the attribute value for IllustrationDocNo, using the alias name IllustrationDocNo.
     * @return the value of IllustrationDocNo
     */
    public String getIllustrationDocNo() {
        return (String) getAttributeInternal(ILLUSTRATIONDOCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for IllustrationDocNo.
     * @param value value to set the IllustrationDocNo
     */
    public void setIllustrationDocNo(String value) {
        setAttributeInternal(ILLUSTRATIONDOCNO, value);
    }

    /**
     * Gets the attribute value for BranchCodeFk, using the alias name BranchCodeFk.
     * @return the value of BranchCodeFk
     */
    public String getBranchCodeFk() {
        return (String) getAttributeInternal(BRANCHCODEFK);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchCodeFk.
     * @param value value to set the BranchCodeFk
     */
    public void setBranchCodeFk(String value) {
        setAttributeInternal(BRANCHCODEFK, value);
    }

    /**
     * Gets the attribute value for WorkflowNotificationId, using the alias name WorkflowNotificationId.
     * @return the value of WorkflowNotificationId
     */
    public Number getWorkflowNotificationId() {
        return (Number) getAttributeInternal(WORKFLOWNOTIFICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkflowNotificationId.
     * @param value value to set the WorkflowNotificationId
     */
    public void setWorkflowNotificationId(Number value) {
        setAttributeInternal(WORKFLOWNOTIFICATIONID, value);
    }

    /**
     * Gets the attribute value for WorkflowStatus, using the alias name WorkflowStatus.
     * @return the value of WorkflowStatus
     */
    public String getWorkflowStatus() {
        return (String) getAttributeInternal(WORKFLOWSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkflowStatus.
     * @param value value to set the WorkflowStatus
     */
    public void setWorkflowStatus(String value) {
        setAttributeInternal(WORKFLOWSTATUS, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssIllustrationCom() {
        return (RowIterator) getAttributeInternal(DSSILLUSTRATIONCOM);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssIllustrationSr() {
        return (RowIterator) getAttributeInternal(DSSILLUSTRATIONSR);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssIllustrationDt() {
        return (RowIterator) getAttributeInternal(DSSILLUSTRATIONDT);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getDssIllustrationRp() {
        return (RowIterator) getAttributeInternal(DSSILLUSTRATIONRP);
    }


    /**
     * @param hdIdPk key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number hdIdPk) {
        return new Key(new Object[] { hdIdPk });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
        protected void create(AttributeList attributeList) {
                     super.create(attributeList);
                     Date currentDate = new Date();
                     setEnterDate((Date) currentDate.getCurrentDate());
                     setLastUpdatedDate((Date) currentDate.getCurrentDate());
                     SequenceImpl seq = new SequenceImpl("DSS_ILLUSTRATION_HD_SEQ", getDBTransaction());
                     setHdIdPk(seq.getSequenceNumber());
                     
                     setBranchStatus("INCOMPLETE");
                     setDssStatus("INCOMPLETE");
                     
                     FacesContext fctx = FacesContext.getCurrentInstance();
                     ExternalContext ectx = fctx.getExternalContext();
                     HttpSession userSession = (HttpSession) ectx.getSession(false);
                     try {
                         setUserIdFk(new Number(userSession.getAttribute("pUserId")));
                         setLastUpdatedBy(new Number(userSession.getAttribute("pUserId")));
                     } catch (SQLException ex) {
                         setUserIdFk(new Number(0));
                         setLastUpdatedBy(new Number(0));
                     }
                 }
    

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
                if (operation == DML_INSERT) {
                    DBTransaction txn = getDBTransaction();
                    CallableStatement callableStatement =
                        txn.createCallableStatement("begin ? := dss_all_pkg.GET_ILLUSTRATION_NUMBER; end;", DBTransaction.DEFAULT);
                    try {
                        callableStatement.registerOutParameter(1, Types.VARCHAR);
                        callableStatement.executeUpdate();
                        String vIllNumber = callableStatement.getString(1);
                        callableStatement.close();
                        setIllustrationDocNo(vIllNumber);
                    } catch (SQLException sqle) {
                        try {
                            callableStatement.close();
                        } catch (SQLException f) {
                        }
                    }
                }
                Date currentDate = new Date();
                if (operation == DML_UPDATE) {
                    setLastUpdatedDate((Date) currentDate.getCurrentDate());
                    FacesContext fctx = FacesContext.getCurrentInstance();
                    ExternalContext ectx = fctx.getExternalContext();
                    HttpSession userSession = (HttpSession) ectx.getSession(false);
                    try {
                        setUserIdFk(new Number(userSession.getAttribute("pUserId")));
                        setLastUpdatedBy(new Number(userSession.getAttribute("pUserId")));
                    } catch (SQLException ex) {
                        setUserIdFk(new Number(0));
                        setLastUpdatedBy(new Number(0));
                    }
                }
                super.doDML(operation, e);
            }
    }
