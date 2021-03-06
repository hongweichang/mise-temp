package com.neteast.rmp.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neteast.rmp.dao.RptFormulaDAO;
import com.neteast.rmp.dao.domain.RptFormula;
import com.neteast.rmp.dao.domain.RptFormulaExample;
import com.neteast.rmp.dao.ibatis.ext.BaseSqlMapClientDaoSupport;
import com.seraph.bi.suite.support.domain.pagination.PageBox;
import com.seraph.bi.suite.support.domain.pagination.PageObject;

@Repository
public class RptFormulaDAOImpl extends BaseSqlMapClientDaoSupport implements RptFormulaDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public RptFormulaDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public Double insert(RptFormula record) {
        Object newKey = getSqlMapClientTemplate().insert("rpt_formula.abatorgenerated_insert", record);
        return (Double) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int updateByPrimaryKey(RptFormula record) {
        int rows = getSqlMapClientTemplate().update("rpt_formula.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int updateByPrimaryKeySelective(RptFormula record) {
        int rows = getSqlMapClientTemplate().update("rpt_formula.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public List selectByExample(RptFormulaExample example, String orderByClause) {
        Map parms = getExampleParms(example);
        if (orderByClause != null) {
            parms.put("ABATOR_ORDER_BY_CLAUSE", orderByClause);
        }
        List list = getSqlMapClientTemplate().queryForList("rpt_formula.abatorgenerated_selectByExample", parms);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public List selectByExample(RptFormulaExample example) {
        return selectByExample(example, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public RptFormula selectByPrimaryKey(Double id) {
        RptFormula key = new RptFormula();
        key.setId(id);
        RptFormula record = (RptFormula) getSqlMapClientTemplate().queryForObject("rpt_formula.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int deleteByExample(RptFormulaExample example) {
        int rows = getSqlMapClientTemplate().delete("rpt_formula.abatorgenerated_deleteByExample", getExampleParms(example));
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int deleteByPrimaryKey(Double id) {
        RptFormula key = new RptFormula();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("rpt_formula.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getIDExampleParms(RptFormulaExample example) {
        Map parms = new HashMap();
        switch (example.getId_Indicator()) {
        case RptFormulaExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_NULL", "Y");
            } else {
                parms.put("AND_ID_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_NOT_NULL", "Y");
            } else {
                parms.put("AND_ID_NOT_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_EQUALS", "Y");
            } else {
                parms.put("AND_ID_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case RptFormulaExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_ID_NOT_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_GT", "Y");
            } else {
                parms.put("AND_ID_GT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_GE", "Y");
            } else {
                parms.put("AND_ID_GE", "Y");
            }
            parms.put("id", example.getId());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_LT", "Y");
            } else {
                parms.put("AND_ID_LT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_LE", "Y");
            } else {
                parms.put("AND_ID_LE", "Y");
            }
            parms.put("id", example.getId());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getRPT_CODEExampleParms(RptFormulaExample example) {
        Map parms = new HashMap();
        switch (example.getRptCode_Indicator()) {
        case RptFormulaExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_CODE_NULL", "Y");
            } else {
                parms.put("AND_RPT_CODE_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_CODE_NOT_NULL", "Y");
            } else {
                parms.put("AND_RPT_CODE_NOT_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_CODE_EQUALS", "Y");
            } else {
                parms.put("AND_RPT_CODE_EQUALS", "Y");
            }
            parms.put("rptCode", example.getRptCode());
            break;
        case RptFormulaExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_CODE_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_RPT_CODE_NOT_EQUALS", "Y");
            }
            parms.put("rptCode", example.getRptCode());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_CODE_GT", "Y");
            } else {
                parms.put("AND_RPT_CODE_GT", "Y");
            }
            parms.put("rptCode", example.getRptCode());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_CODE_GE", "Y");
            } else {
                parms.put("AND_RPT_CODE_GE", "Y");
            }
            parms.put("rptCode", example.getRptCode());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_CODE_LT", "Y");
            } else {
                parms.put("AND_RPT_CODE_LT", "Y");
            }
            parms.put("rptCode", example.getRptCode());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_CODE_LE", "Y");
            } else {
                parms.put("AND_RPT_CODE_LE", "Y");
            }
            parms.put("rptCode", example.getRptCode());
            break;
        case RptFormulaExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_CODE_LIKE", "Y");
            } else {
                parms.put("AND_RPT_CODE_LIKE", "Y");
            }
            parms.put("rptCode", example.getRptCode());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getROW_INDEXExampleParms(RptFormulaExample example) {
        Map parms = new HashMap();
        switch (example.getRowIndex_Indicator()) {
        case RptFormulaExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_INDEX_NULL", "Y");
            } else {
                parms.put("AND_ROW_INDEX_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_INDEX_NOT_NULL", "Y");
            } else {
                parms.put("AND_ROW_INDEX_NOT_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_INDEX_EQUALS", "Y");
            } else {
                parms.put("AND_ROW_INDEX_EQUALS", "Y");
            }
            parms.put("rowIndex", example.getRowIndex());
            break;
        case RptFormulaExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_INDEX_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_ROW_INDEX_NOT_EQUALS", "Y");
            }
            parms.put("rowIndex", example.getRowIndex());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_INDEX_GT", "Y");
            } else {
                parms.put("AND_ROW_INDEX_GT", "Y");
            }
            parms.put("rowIndex", example.getRowIndex());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_INDEX_GE", "Y");
            } else {
                parms.put("AND_ROW_INDEX_GE", "Y");
            }
            parms.put("rowIndex", example.getRowIndex());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_INDEX_LT", "Y");
            } else {
                parms.put("AND_ROW_INDEX_LT", "Y");
            }
            parms.put("rowIndex", example.getRowIndex());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_INDEX_LE", "Y");
            } else {
                parms.put("AND_ROW_INDEX_LE", "Y");
            }
            parms.put("rowIndex", example.getRowIndex());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getCOL_INDEXExampleParms(RptFormulaExample example) {
        Map parms = new HashMap();
        switch (example.getColIndex_Indicator()) {
        case RptFormulaExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_INDEX_NULL", "Y");
            } else {
                parms.put("AND_COL_INDEX_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_INDEX_NOT_NULL", "Y");
            } else {
                parms.put("AND_COL_INDEX_NOT_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_INDEX_EQUALS", "Y");
            } else {
                parms.put("AND_COL_INDEX_EQUALS", "Y");
            }
            parms.put("colIndex", example.getColIndex());
            break;
        case RptFormulaExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_INDEX_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_COL_INDEX_NOT_EQUALS", "Y");
            }
            parms.put("colIndex", example.getColIndex());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_INDEX_GT", "Y");
            } else {
                parms.put("AND_COL_INDEX_GT", "Y");
            }
            parms.put("colIndex", example.getColIndex());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_INDEX_GE", "Y");
            } else {
                parms.put("AND_COL_INDEX_GE", "Y");
            }
            parms.put("colIndex", example.getColIndex());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_INDEX_LT", "Y");
            } else {
                parms.put("AND_COL_INDEX_LT", "Y");
            }
            parms.put("colIndex", example.getColIndex());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_INDEX_LE", "Y");
            } else {
                parms.put("AND_COL_INDEX_LE", "Y");
            }
            parms.put("colIndex", example.getColIndex());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getRPT_FORMULAExampleParms(RptFormulaExample example) {
        Map parms = new HashMap();
        switch (example.getRptFormula_Indicator()) {
        case RptFormulaExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_FORMULA_NULL", "Y");
            } else {
                parms.put("AND_RPT_FORMULA_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_FORMULA_NOT_NULL", "Y");
            } else {
                parms.put("AND_RPT_FORMULA_NOT_NULL", "Y");
            }
            break;
        case RptFormulaExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_FORMULA_EQUALS", "Y");
            } else {
                parms.put("AND_RPT_FORMULA_EQUALS", "Y");
            }
            parms.put("rptFormula", example.getRptFormula());
            break;
        case RptFormulaExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_FORMULA_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_RPT_FORMULA_NOT_EQUALS", "Y");
            }
            parms.put("rptFormula", example.getRptFormula());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_FORMULA_GT", "Y");
            } else {
                parms.put("AND_RPT_FORMULA_GT", "Y");
            }
            parms.put("rptFormula", example.getRptFormula());
            break;
        case RptFormulaExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_FORMULA_GE", "Y");
            } else {
                parms.put("AND_RPT_FORMULA_GE", "Y");
            }
            parms.put("rptFormula", example.getRptFormula());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_FORMULA_LT", "Y");
            } else {
                parms.put("AND_RPT_FORMULA_LT", "Y");
            }
            parms.put("rptFormula", example.getRptFormula());
            break;
        case RptFormulaExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_FORMULA_LE", "Y");
            } else {
                parms.put("AND_RPT_FORMULA_LE", "Y");
            }
            parms.put("rptFormula", example.getRptFormula());
            break;
        case RptFormulaExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_RPT_FORMULA_LIKE", "Y");
            } else {
                parms.put("AND_RPT_FORMULA_LIKE", "Y");
            }
            parms.put("rptFormula", example.getRptFormula());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getExampleParms(RptFormulaExample example) {
        Map parms = new HashMap();
        parms.putAll(getIDExampleParms(example));
        parms.putAll(getRPT_CODEExampleParms(example));
        parms.putAll(getROW_INDEXExampleParms(example));
        parms.putAll(getCOL_INDEXExampleParms(example));
        parms.putAll(getRPT_FORMULAExampleParms(example));
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int selectCountByExample(RptFormulaExample example) {
        Map parms = getExampleParms(example);
        int count = ((Integer)getSqlMapClientTemplate().queryForObject("rpt_formula.abatorgenerated_selectCountByExample", parms)).intValue();
        return count;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public PageBox selectByExampleWithPaging(RptFormulaExample example, int pageSize, int pageNum, String orderByClause) {
        Map parms = getExampleParms(example);
        if (orderByClause != null) {
            parms.put("ABATOR_ORDER_BY_CLAUSE", orderByClause);
        }
        PageBox pageBox = new PageBox();
        PageObject pageObject = new PageObject();
        pageObject.setPageSize(pageSize);
        pageObject.setPageIndex(pageNum);
        int itemAmount = selectCountByExample(example);
        pageObject.setItemAmount(itemAmount);
        List pageList = null;
        if (pageObject.getBeginIndex() <= pageObject.getItemAmount()) {
            pageList = (getSqlMapClientTemplate().queryForList("rpt_formula.abatorgenerated_selectByExample", parms, pageObject.getBeginIndex() - 1, pageSize));
        }
        pageBox.setPageObject(pageObject);
        pageBox.setPageList(pageList);
        return pageBox;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public PageBox selectByExampleWithPaging(RptFormulaExample example, int pageSize, int pageNum) {
        return selectByExampleWithPaging(example, pageSize, pageNum, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table rpt_formula
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int updateByPrimaryKeyForCgs(RptFormula record) {
        int rows = getSqlMapClientTemplate().update("rpt_formula.abatorgenerated_updateByPrimaryKeyForCgs", record);
        return rows;
    }
}