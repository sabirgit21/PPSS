package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 24 11:30:19 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblPblCustImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        Name,
        Type,
        GlL4Id,
        CustBuss,
        ContactPer,
        Phone,
        Designation,
        Cnic,
        Cell,
        Fax,
        Ntn,
        Strn,
        EMail,
        Url,
        GroupCompanyId,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        CompanySbuId,
        TblCustOpenBlnc;
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
    public static final int NAME = AttributesEnum.Name.index();
    public static final int TYPE = AttributesEnum.Type.index();
    public static final int GLL4ID = AttributesEnum.GlL4Id.index();
    public static final int CUSTBUSS = AttributesEnum.CustBuss.index();
    public static final int CONTACTPER = AttributesEnum.ContactPer.index();
    public static final int PHONE = AttributesEnum.Phone.index();
    public static final int DESIGNATION = AttributesEnum.Designation.index();
    public static final int CNIC = AttributesEnum.Cnic.index();
    public static final int CELL = AttributesEnum.Cell.index();
    public static final int FAX = AttributesEnum.Fax.index();
    public static final int NTN = AttributesEnum.Ntn.index();
    public static final int STRN = AttributesEnum.Strn.index();
    public static final int EMAIL = AttributesEnum.EMail.index();
    public static final int URL = AttributesEnum.Url.index();
    public static final int GROUPCOMPANYID = AttributesEnum.GroupCompanyId.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int COMPANYSBUID = AttributesEnum.CompanySbuId.index();
    public static final int TBLCUSTOPENBLNC = AttributesEnum.TblCustOpenBlnc.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblPblCustImpl() {
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
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for Type, using the alias name Type.
     * @return the value of Type
     */
    public String getType() {
        return (String) getAttributeInternal(TYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Type.
     * @param value value to set the Type
     */
    public void setType(String value) {
        setAttributeInternal(TYPE, value);
    }

    /**
     * Gets the attribute value for GlL4Id, using the alias name GlL4Id.
     * @return the value of GlL4Id
     */
    public BigDecimal getGlL4Id() {
        return (BigDecimal) getAttributeInternal(GLL4ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlL4Id.
     * @param value value to set the GlL4Id
     */
    public void setGlL4Id(BigDecimal value) {
        setAttributeInternal(GLL4ID, value);
    }

    /**
     * Gets the attribute value for CustBuss, using the alias name CustBuss.
     * @return the value of CustBuss
     */
    public String getCustBuss() {
        return (String) getAttributeInternal(CUSTBUSS);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustBuss.
     * @param value value to set the CustBuss
     */
    public void setCustBuss(String value) {
        setAttributeInternal(CUSTBUSS, value);
    }

    /**
     * Gets the attribute value for ContactPer, using the alias name ContactPer.
     * @return the value of ContactPer
     */
    public String getContactPer() {
        return (String) getAttributeInternal(CONTACTPER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactPer.
     * @param value value to set the ContactPer
     */
    public void setContactPer(String value) {
        setAttributeInternal(CONTACTPER, value);
    }

    /**
     * Gets the attribute value for Phone, using the alias name Phone.
     * @return the value of Phone
     */
    public String getPhone() {
        return (String) getAttributeInternal(PHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Phone.
     * @param value value to set the Phone
     */
    public void setPhone(String value) {
        setAttributeInternal(PHONE, value);
    }

    /**
     * Gets the attribute value for Designation, using the alias name Designation.
     * @return the value of Designation
     */
    public String getDesignation() {
        return (String) getAttributeInternal(DESIGNATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Designation.
     * @param value value to set the Designation
     */
    public void setDesignation(String value) {
        setAttributeInternal(DESIGNATION, value);
    }

    /**
     * Gets the attribute value for Cnic, using the alias name Cnic.
     * @return the value of Cnic
     */
    public String getCnic() {
        return (String) getAttributeInternal(CNIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cnic.
     * @param value value to set the Cnic
     */
    public void setCnic(String value) {
        setAttributeInternal(CNIC, value);
    }

    /**
     * Gets the attribute value for Cell, using the alias name Cell.
     * @return the value of Cell
     */
    public String getCell() {
        return (String) getAttributeInternal(CELL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cell.
     * @param value value to set the Cell
     */
    public void setCell(String value) {
        setAttributeInternal(CELL, value);
    }

    /**
     * Gets the attribute value for Fax, using the alias name Fax.
     * @return the value of Fax
     */
    public String getFax() {
        return (String) getAttributeInternal(FAX);
    }

    /**
     * Sets <code>value</code> as the attribute value for Fax.
     * @param value value to set the Fax
     */
    public void setFax(String value) {
        setAttributeInternal(FAX, value);
    }

    /**
     * Gets the attribute value for Ntn, using the alias name Ntn.
     * @return the value of Ntn
     */
    public String getNtn() {
        return (String) getAttributeInternal(NTN);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ntn.
     * @param value value to set the Ntn
     */
    public void setNtn(String value) {
        setAttributeInternal(NTN, value);
    }

    /**
     * Gets the attribute value for Strn, using the alias name Strn.
     * @return the value of Strn
     */
    public String getStrn() {
        return (String) getAttributeInternal(STRN);
    }

    /**
     * Sets <code>value</code> as the attribute value for Strn.
     * @param value value to set the Strn
     */
    public void setStrn(String value) {
        setAttributeInternal(STRN, value);
    }

    /**
     * Gets the attribute value for EMail, using the alias name EMail.
     * @return the value of EMail
     */
    public String getEMail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for EMail.
     * @param value value to set the EMail
     */
    public void setEMail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for Url, using the alias name Url.
     * @return the value of Url
     */
    public String getUrl() {
        return (String) getAttributeInternal(URL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Url.
     * @param value value to set the Url
     */
    public void setUrl(String value) {
        setAttributeInternal(URL, value);
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
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
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
     * Sets <code>value</code> as the attribute value for UpdatedDate.
     * @param value value to set the UpdatedDate
     */
    public void setUpdatedDate(Timestamp value) {
        setAttributeInternal(UPDATEDDATE, value);
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
     * Gets the attribute value for CompanySbuId, using the alias name CompanySbuId.
     * @return the value of CompanySbuId
     */
    public Number getCompanySbuId() {
        return (Number) getAttributeInternal(COMPANYSBUID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanySbuId.
     * @param value value to set the CompanySbuId
     */
    public void setCompanySbuId(Number value) {
        setAttributeInternal(COMPANYSBUID, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblCustOpenBlnc() {
        return (RowIterator) getAttributeInternal(TBLCUSTOPENBLNC);
    }

    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblPblCust");
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
         
         if (operation == DML_INSERT) {

             setGroupCompanyId(cmpnyId);
             setCompanySbuId(sbuId);

             setCreatedBy(userId);
             setUpdatedBy(userId);
             } else if(operation == DML_UPDATE) {
             
             setGroupCompanyId(cmpnyId);
             setCompanySbuId(sbuId);
             
             setUpdatedBy(userId);
         }
        super.doDML(operation, e);
    }
}

