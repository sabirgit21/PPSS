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
// ---    Wed Apr 01 13:50:16 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblRegFeeRecImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        Dated,
        StdRegId,
        RecType,
        ChqNo,
        ChqDate,
        Bank,
        Amount,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        CompanySbuId,
        GroupCompanyId;
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
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int STDREGID = AttributesEnum.StdRegId.index();
    public static final int RECTYPE = AttributesEnum.RecType.index();
    public static final int CHQNO = AttributesEnum.ChqNo.index();
    public static final int CHQDATE = AttributesEnum.ChqDate.index();
    public static final int BANK = AttributesEnum.Bank.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int COMPANYSBUID = AttributesEnum.CompanySbuId.index();
    public static final int GROUPCOMPANYID = AttributesEnum.GroupCompanyId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblRegFeeRecImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblRegFeeRec");
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
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
    }

    /**
     * Gets the attribute value for StdRegId, using the alias name StdRegId.
     * @return the value of StdRegId
     */
    public BigDecimal getStdRegId() {
        return (BigDecimal) getAttributeInternal(STDREGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StdRegId.
     * @param value value to set the StdRegId
     */
    public void setStdRegId(BigDecimal value) {
        setAttributeInternal(STDREGID, value);
    }

    /**
     * Gets the attribute value for RecType, using the alias name RecType.
     * @return the value of RecType
     */
    public String getRecType() {
        return (String) getAttributeInternal(RECTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RecType.
     * @param value value to set the RecType
     */
    public void setRecType(String value) {
        setAttributeInternal(RECTYPE, value);
    }

    /**
     * Gets the attribute value for ChqNo, using the alias name ChqNo.
     * @return the value of ChqNo
     */
    public String getChqNo() {
        return (String) getAttributeInternal(CHQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqNo.
     * @param value value to set the ChqNo
     */
    public void setChqNo(String value) {
        setAttributeInternal(CHQNO, value);
    }

    /**
     * Gets the attribute value for ChqDate, using the alias name ChqDate.
     * @return the value of ChqDate
     */
    public Timestamp getChqDate() {
        return (Timestamp) getAttributeInternal(CHQDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqDate.
     * @param value value to set the ChqDate
     */
    public void setChqDate(Timestamp value) {
        setAttributeInternal(CHQDATE, value);
    }

    /**
     * Gets the attribute value for Bank, using the alias name Bank.
     * @return the value of Bank
     */
    public String getBank() {
        return (String) getAttributeInternal(BANK);
    }

    /**
     * Sets <code>value</code> as the attribute value for Bank.
     * @param value value to set the Bank
     */
    public void setBank(String value) {
        setAttributeInternal(BANK, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
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

