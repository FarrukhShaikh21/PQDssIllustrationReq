package pqt.dss.illustration.view.backing.fragments;

import javax.faces.application.FacesMessage;
import javax.faces.component.UISelectItems;

import javax.faces.context.FacesContext;
import oracle.binding.BindingContainer;
import oracle.adf.model.AttributeBinding;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelDashboard;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.binding.OperationBinding;

import oracle.jbo.JboException;

public class IllustrationDetailPage {
    private RichPanelHeader ph1;
    private RichPanelDashboard pd1;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichPanelBox pb3;
    private RichPanelBox pb4;
    private RichPanelFormLayout pfl2;
    private RichInputDate id2;
    private RichInputDate id3;
    private RichInputText it4;
    private RichInputText it5;
    private RichPanelFormLayout pfl3;
    private RichInputText it6;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichInputText it7;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichInputText it8;
    private RichTable t1;
    private RichPanelFormLayout pfl4;
    private RichInputText it11;
    private RichInputText it12;
    private RichInputDate id4;
    private RichInputText it13;
    private RichInputText it14;
    private RichToolbar t2;
    private RichButton b1;
    private RichPanelFormLayout pfl1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputDate id1;
    private RichInputText it15;
    private RichButton b2;
    private RichPanelLabelAndMessage plam3;
    private RichOutputText ot3;
    private RichInputComboboxListOfValues branchNameId;
    private RichInputListOfValues agentCodeId;
    private RichInputText it1;
    private RichInputText it16;

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }
    public String Branch_action() {
        // Add event code here...
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operation = bindings.getOperationBinding("callWorkflow");
        operation.getParamsMap().put("p_document_id", getAttributeValue("HdIdPk"));
        operation.getParamsMap().put("ApprovalType", "BRANCH");
        Object result = operation.execute();
        if (!operation.getErrors().isEmpty()) {
            JboException ex = new JboException("Some thing went wrong while sending Notification.");
            BindingContext bctx = BindingContext.getCurrent();
            ((DCBindingContainer) bctx.getCurrentBindingsEntry()).reportException(ex);
        }
        this.SendMessage();
        return "backQuery";
    }

    public String Dss_action() {
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operation = bindings.getOperationBinding("callWorkflow");
        operation.getParamsMap().put("p_document_id", getAttributeValue("HdIdPk"));
        operation.getParamsMap().put("ApprovalType", "DSS");
        Object result = operation.execute();
        if (!operation.getErrors().isEmpty()) {
            JboException ex = new JboException("Some thing went wrong while sending Notification.");
            BindingContext bctx = BindingContext.getCurrent();
            ((DCBindingContainer) bctx.getCurrentBindingsEntry()).reportException(ex);
        }
        this.SendMessage();
        return "backQuery";
    }

    public Object getAttributeValue(String AttrName) {
        BindingContainer bdCont = BindingContext.getCurrent().getCurrentBindingsEntry();
        AttributeBinding val = (AttributeBinding) bdCont.getControlBinding(AttrName);
        return val.getInputValue();
    }

    public String Approve_action() {
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operation = bindings.getOperationBinding("DssApprove");
        operation.execute();
        this.SendMessage();
        return "backQuery";
    }

    public void SendMessage() {
        FacesMessage Message = new FacesMessage("Workflow has been submitted successfully!");
        Message.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext fc = FacesContext.getCurrentInstance();
        fc.addMessage(null, Message);
    }

    public void setPd1(RichPanelDashboard pd1) {
        this.pd1 = pd1;
    }

    public RichPanelDashboard getPd1() {
        return pd1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }

    public void setPb4(RichPanelBox pb4) {
        this.pb4 = pb4;
    }

    public RichPanelBox getPb4() {
        return pb4;
    }


    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public void setId4(RichInputDate id4) {
        this.id4 = id4;
    }

    public RichInputDate getId4() {
        return id4;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }


    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }


    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }


    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setOt3(RichOutputText ot3) {
        this.ot3 = ot3;
    }

    public RichOutputText getOt3() {
        return ot3;
    }

    public void setBranchNameId(RichInputComboboxListOfValues branchNameId) {
        this.branchNameId = branchNameId;
    }

    public RichInputComboboxListOfValues getBranchNameId() {
        return branchNameId;
    }


    public void setAgentCodeId(RichInputListOfValues agentCodeId) {
        this.agentCodeId = agentCodeId;
    }

    public RichInputListOfValues getAgentCodeId() {
        return agentCodeId;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }
    public String SubmitForApproval() {
        // Add event code here...
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding operation = bindings.getOperationBinding("callIllustrationWorkflow");
        operation.getParamsMap().put("p_document_id", getAttributeValue("HdIdPk"));
        operation.execute();

        return "backQuery";
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }
}
