package pqt.dss.illustration.model.vo;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;

import pqt.dss.illustration.model.vo.common.DssIllustrationHdView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 31 10:43:36 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DssIllustrationHdViewImpl extends ViewObjectImpl implements DssIllustrationHdView {
    /**
     * This is the default constructor (do not remove).
     */
    public DssIllustrationHdViewImpl() {
    }

    /**
     * Returns the variable value for QVC_MEMBERSHIPNO.
     * @return variable value for QVC_MEMBERSHIPNO
     */
    public Number getQVC_MEMBERSHIPNO() {
        return (Number) ensureVariableManager().getVariableValue("QVC_MEMBERSHIPNO");
    }

    /**
     * Sets <code>value</code> for variable QVC_MEMBERSHIPNO.
     * @param value value to bind as QVC_MEMBERSHIPNO
     */
    public void setQVC_MEMBERSHIPNO(Number value) {
        ensureVariableManager().setVariableValue("QVC_MEMBERSHIPNO", value);
    }

    /**
     * Returns the variable value for QVC_PLAN_NAME.
     * @return variable value for QVC_PLAN_NAME
     */
    public String getQVC_PLAN_NAME() {
        return (String) ensureVariableManager().getVariableValue("QVC_PLAN_NAME");
    }

    /**
     * Sets <code>value</code> for variable QVC_PLAN_NAME.
     * @param value value to bind as QVC_PLAN_NAME
     */
    public void setQVC_PLAN_NAME(String value) {
        ensureVariableManager().setVariableValue("QVC_PLAN_NAME", value);
    }

    /**
     * Returns the variable value for NVC_WfDocumentId.
     * @return variable value for NVC_WfDocumentId
     */
    public Number getNVC_WfDocumentId() {
        return (Number) ensureVariableManager().getVariableValue("NVC_WfDocumentId");
    }

    /**
     * Sets <code>value</code> for variable NVC_WfDocumentId.
     * @param value value to bind as NVC_WfDocumentId
     */
    public void setNVC_WfDocumentId(Number value) {
        ensureVariableManager().setVariableValue("NVC_WfDocumentId", value);
        this.exeViewCrieteria(value);
    }
    public void exeViewCrieteria(Number val) {
        ViewObject vo = this.getViewObject();
        ViewCriteria vc = this.getViewCriteria("NotificationViewCriteria");
        vo.applyViewCriteria(vc);
        vo.setNamedWhereClauseParam("NVC_WfDocumentId", val);
        vo.executeQuery();
    }

    /**
     * Returns the variable value for VC_Doc_No.
     * @return variable value for VC_Doc_No
     */
    public String getVC_Doc_No() {
        return (String) ensureVariableManager().getVariableValue("VC_Doc_No");
    }

    /**
     * Sets <code>value</code> for variable VC_Doc_No.
     * @param value value to bind as VC_Doc_No
     */
    public void setVC_Doc_No(String value) {
        ensureVariableManager().setVariableValue("VC_Doc_No", value);
    }

    public void illustrationSearchUser()
    {
              ViewCriteria vc = this.getViewCriteria("DssIllustrationHdViewCriteria");
              this.applyViewCriteria(vc);
              setWhereClause(null);
              FacesContext fctx = FacesContext.getCurrentInstance();
              ExternalContext ectx = fctx.getExternalContext();
              HttpSession userSession = (HttpSession) ectx.getSession(false);
              Object VUserID = userSession.getAttribute("pUserId") == null ? "0" : userSession.getAttribute("pUserId");
              setWhereClause("exists\n" + 
              " (select 1 \n" + 
              "          from dss_sm_user_branch a\n" + 
              "         where a.user_id_fk = "+ VUserID+"\n" + 
              "           and a.branch_code = BRANCH_CODE_FK)");
    //              setWhereClause("USER_ID_FK =" + VUserID);
              executeQuery();
          }

}

