package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Mar 18 23:04:04 PDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblSectionTimetableDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        StaffId,
        StaffSubjectId,
        GroupCompanyId,
        WeekDays,
        FromTime,
        ToTime,
        TimeDiff,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        SectionTimetableMasterId,
        TblStaffSubject,
        TblSectionTimetableMaster;
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

    public static final int ID = AttributesEnum.Id.index();
    public static final int STAFFID = AttributesEnum.StaffId.index();
    public static final int STAFFSUBJECTID = AttributesEnum.StaffSubjectId.index();
    public static final int GROUPCOMPANYID = AttributesEnum.GroupCompanyId.index();
    public static final int WEEKDAYS = AttributesEnum.WeekDays.index();
    public static final int FROMTIME = AttributesEnum.FromTime.index();
    public static final int TOTIME = AttributesEnum.ToTime.index();
    public static final int TIMEDIFF = AttributesEnum.TimeDiff.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int SECTIONTIMETABLEMASTERID = AttributesEnum.SectionTimetableMasterId.index();
    public static final int TBLSTAFFSUBJECT = AttributesEnum.TblStaffSubject.index();
    public static final int TBLSECTIONTIMETABLEMASTER = AttributesEnum.TblSectionTimetableMaster.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblSectionTimetableDetailImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblSectionTimetableDetail");
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public BigDecimal getId() {
        return (BigDecimal) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(BigDecimal value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for StaffId, using the alias name StaffId.
     * @return the value of StaffId
     */
    public BigDecimal getStaffId() {
        return (BigDecimal) getAttributeInternal(STAFFID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StaffId.
     * @param value value to set the StaffId
     */
    public void setStaffId(BigDecimal value) {
        setAttributeInternal(STAFFID, value);
    }

    /**
     * Gets the attribute value for StaffSubjectId, using the alias name StaffSubjectId.
     * @return the value of StaffSubjectId
     */
    public BigDecimal getStaffSubjectId() {
        return (BigDecimal) getAttributeInternal(STAFFSUBJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StaffSubjectId.
     * @param value value to set the StaffSubjectId
     */
    public void setStaffSubjectId(BigDecimal value) {
        setAttributeInternal(STAFFSUBJECTID, value);
    }

    /**
     * Gets the attribute value for GroupCompanyId, using the alias name GroupCompanyId.
     * @return the value of GroupCompanyId
     */
    public Number getGroupCompanyId() {
        return (Number) getAttributeInternal(GROUPCOMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GroupCompanyId.
     * @param value value to set the GroupCompanyId
     */
    public void setGroupCompanyId(Number value) {
        setAttributeInternal(GROUPCOMPANYID, value);
    }

    /**
     * Gets the attribute value for WeekDays, using the alias name WeekDays.
     * @return the value of WeekDays
     */
    public String getWeekDays() {
        return (String) getAttributeInternal(WEEKDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for WeekDays.
     * @param value value to set the WeekDays
     */
    public void setWeekDays(String value) {
        setAttributeInternal(WEEKDAYS, value);
    }

    /**
     * Gets the attribute value for FromTime, using the alias name FromTime.
     * @return the value of FromTime
     */
    public Timestamp getFromTime() {
        return (Timestamp) getAttributeInternal(FROMTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromTime.
     * @param value value to set the FromTime
     */
    public void setFromTime(Timestamp value) {
        setAttributeInternal(FROMTIME, value);
    }

    /**
     * Gets the attribute value for ToTime, using the alias name ToTime.
     * @return the value of ToTime
     */
    public Timestamp getToTime() {
        return (Timestamp) getAttributeInternal(TOTIME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToTime.
     * @param value value to set the ToTime
     */
    public void setToTime(Timestamp value) {
        setAttributeInternal(TOTIME, value);
    }

    /**
     * Gets the attribute value for TimeDiff, using the alias name TimeDiff.
     * @return the value of TimeDiff
     */
    public BigDecimal getTimeDiff() {
        return (BigDecimal) getAttributeInternal(TIMEDIFF);
    }

    /**
     * Sets <code>value</code> as the attribute value for TimeDiff.
     * @param value value to set the TimeDiff
     */
    public void setTimeDiff(BigDecimal value) {
        setAttributeInternal(TIMEDIFF, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for SectionTimetableMasterId, using the alias name SectionTimetableMasterId.
     * @return the value of SectionTimetableMasterId
     */
    public BigDecimal getSectionTimetableMasterId() {
        return (BigDecimal) getAttributeInternal(SECTIONTIMETABLEMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SectionTimetableMasterId.
     * @param value value to set the SectionTimetableMasterId
     */
    public void setSectionTimetableMasterId(BigDecimal value) {
        setAttributeInternal(SECTIONTIMETABLEMASTERID, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblStaffSubjectImpl getTblStaffSubject() {
        return (TblStaffSubjectImpl) getAttributeInternal(TBLSTAFFSUBJECT);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblStaffSubject(TblStaffSubjectImpl value) {
        setAttributeInternal(TBLSTAFFSUBJECT, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblSectionTimetableMasterImpl getTblSectionTimetableMaster() {
        return (TblSectionTimetableMasterImpl) getAttributeInternal(TBLSECTIONTIMETABLEMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblSectionTimetableMaster(TblSectionTimetableMasterImpl value) {
        setAttributeInternal(TBLSECTIONTIMETABLEMASTER, value);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
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
        Number userId = null;
        Number cmpnyId = null;
        Number sbuId = null;
         try {
             userId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
             cmpnyId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessCmpnyID"));
             sbuId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessSBUID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
//         if (operation == DML_INSERT) {
//
//             setGroupCompanyId(cmpnyId);
//             setCompanySbuId(sbuId);
//
//             setCreatedBy(userId);
//             setUpdatedBy(userId);
//             } else if(operation == DML_UPDATE) {
//             
//             setGroupCompanyId(cmpnyId);
//             setCompanySbuId(sbuId);
//             
//             setUpdatedBy(userId);
//         }
        super.doDML(operation, e);
    }
}

