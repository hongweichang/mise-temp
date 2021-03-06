package com.neteast.rmp.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neteast.rmp.dao.ScOptDAO;
import com.neteast.rmp.dao.domain.ScOpt;
import com.neteast.rmp.dao.domain.ScOptExample;
import com.neteast.rmp.dao.ibatis.ext.BaseSqlMapClientDaoSupport;
import com.seraph.bi.suite.support.domain.pagination.PageBox;
import com.seraph.bi.suite.support.domain.pagination.PageObject;

@Repository
public class ScOptDAOImpl extends BaseSqlMapClientDaoSupport implements ScOptDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public ScOptDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public Integer insert(ScOpt record) {
        Object newKey = getSqlMapClientTemplate().insert("sc_opt.abatorgenerated_insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int updateByPrimaryKey(ScOpt record) {
        int rows = getSqlMapClientTemplate().update("sc_opt.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int updateByPrimaryKeySelective(ScOpt record) {
        int rows = getSqlMapClientTemplate().update("sc_opt.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public List selectByExample(ScOptExample example, String orderByClause) {
        Map parms = getExampleParms(example);
        if (orderByClause != null) {
            parms.put("ABATOR_ORDER_BY_CLAUSE", orderByClause);
        }
        List list = getSqlMapClientTemplate().queryForList("sc_opt.abatorgenerated_selectByExample", parms);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public List selectByExample(ScOptExample example) {
        return selectByExample(example, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public ScOpt selectByPrimaryKey(Integer id) {
        ScOpt key = new ScOpt();
        key.setId(id);
        ScOpt record = (ScOpt) getSqlMapClientTemplate().queryForObject("sc_opt.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int deleteByExample(ScOptExample example) {
        int rows = getSqlMapClientTemplate().delete("sc_opt.abatorgenerated_deleteByExample", getExampleParms(example));
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int deleteByPrimaryKey(Integer id) {
        ScOpt key = new ScOpt();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("sc_opt.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getIDExampleParms(ScOptExample example) {
        Map parms = new HashMap();
        switch (example.getId_Indicator()) {
        case ScOptExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_NULL", "Y");
            } else {
                parms.put("AND_ID_NULL", "Y");
            }
            break;
        case ScOptExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_NOT_NULL", "Y");
            } else {
                parms.put("AND_ID_NOT_NULL", "Y");
            }
            break;
        case ScOptExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_EQUALS", "Y");
            } else {
                parms.put("AND_ID_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScOptExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_ID_NOT_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScOptExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_GT", "Y");
            } else {
                parms.put("AND_ID_GT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScOptExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_GE", "Y");
            } else {
                parms.put("AND_ID_GE", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScOptExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_LT", "Y");
            } else {
                parms.put("AND_ID_LT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScOptExample.EXAMPLE_LESS_THAN_OR_EQUAL:
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
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getOPT_CODEExampleParms(ScOptExample example) {
        Map parms = new HashMap();
        switch (example.getOptCode_Indicator()) {
        case ScOptExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_CODE_NULL", "Y");
            } else {
                parms.put("AND_OPT_CODE_NULL", "Y");
            }
            break;
        case ScOptExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_CODE_NOT_NULL", "Y");
            } else {
                parms.put("AND_OPT_CODE_NOT_NULL", "Y");
            }
            break;
        case ScOptExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_CODE_EQUALS", "Y");
            } else {
                parms.put("AND_OPT_CODE_EQUALS", "Y");
            }
            parms.put("optCode", example.getOptCode());
            break;
        case ScOptExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_CODE_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_OPT_CODE_NOT_EQUALS", "Y");
            }
            parms.put("optCode", example.getOptCode());
            break;
        case ScOptExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_CODE_GT", "Y");
            } else {
                parms.put("AND_OPT_CODE_GT", "Y");
            }
            parms.put("optCode", example.getOptCode());
            break;
        case ScOptExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_CODE_GE", "Y");
            } else {
                parms.put("AND_OPT_CODE_GE", "Y");
            }
            parms.put("optCode", example.getOptCode());
            break;
        case ScOptExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_CODE_LT", "Y");
            } else {
                parms.put("AND_OPT_CODE_LT", "Y");
            }
            parms.put("optCode", example.getOptCode());
            break;
        case ScOptExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_CODE_LE", "Y");
            } else {
                parms.put("AND_OPT_CODE_LE", "Y");
            }
            parms.put("optCode", example.getOptCode());
            break;
        case ScOptExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_CODE_LIKE", "Y");
            } else {
                parms.put("AND_OPT_CODE_LIKE", "Y");
            }
            parms.put("optCode", example.getOptCode());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getOPT_NAMEExampleParms(ScOptExample example) {
        Map parms = new HashMap();
        switch (example.getOptName_Indicator()) {
        case ScOptExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_NAME_NULL", "Y");
            } else {
                parms.put("AND_OPT_NAME_NULL", "Y");
            }
            break;
        case ScOptExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_NAME_NOT_NULL", "Y");
            } else {
                parms.put("AND_OPT_NAME_NOT_NULL", "Y");
            }
            break;
        case ScOptExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_NAME_EQUALS", "Y");
            } else {
                parms.put("AND_OPT_NAME_EQUALS", "Y");
            }
            parms.put("optName", example.getOptName());
            break;
        case ScOptExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_NAME_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_OPT_NAME_NOT_EQUALS", "Y");
            }
            parms.put("optName", example.getOptName());
            break;
        case ScOptExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_NAME_GT", "Y");
            } else {
                parms.put("AND_OPT_NAME_GT", "Y");
            }
            parms.put("optName", example.getOptName());
            break;
        case ScOptExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_NAME_GE", "Y");
            } else {
                parms.put("AND_OPT_NAME_GE", "Y");
            }
            parms.put("optName", example.getOptName());
            break;
        case ScOptExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_NAME_LT", "Y");
            } else {
                parms.put("AND_OPT_NAME_LT", "Y");
            }
            parms.put("optName", example.getOptName());
            break;
        case ScOptExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_NAME_LE", "Y");
            } else {
                parms.put("AND_OPT_NAME_LE", "Y");
            }
            parms.put("optName", example.getOptName());
            break;
        case ScOptExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_OPT_NAME_LIKE", "Y");
            } else {
                parms.put("AND_OPT_NAME_LIKE", "Y");
            }
            parms.put("optName", example.getOptName());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getDESCRIPTIONExampleParms(ScOptExample example) {
        Map parms = new HashMap();
        switch (example.getDescription_Indicator()) {
        case ScOptExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_NULL", "Y");
            } else {
                parms.put("AND_DESCRIPTION_NULL", "Y");
            }
            break;
        case ScOptExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_NOT_NULL", "Y");
            } else {
                parms.put("AND_DESCRIPTION_NOT_NULL", "Y");
            }
            break;
        case ScOptExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_EQUALS", "Y");
            } else {
                parms.put("AND_DESCRIPTION_EQUALS", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScOptExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_DESCRIPTION_NOT_EQUALS", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScOptExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_GT", "Y");
            } else {
                parms.put("AND_DESCRIPTION_GT", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScOptExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_GE", "Y");
            } else {
                parms.put("AND_DESCRIPTION_GE", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScOptExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_LT", "Y");
            } else {
                parms.put("AND_DESCRIPTION_LT", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScOptExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_LE", "Y");
            } else {
                parms.put("AND_DESCRIPTION_LE", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScOptExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_LIKE", "Y");
            } else {
                parms.put("AND_DESCRIPTION_LIKE", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Map getExampleParms(ScOptExample example) {
        Map parms = new HashMap();
        parms.putAll(getIDExampleParms(example));
        parms.putAll(getOPT_CODEExampleParms(example));
        parms.putAll(getOPT_NAMEExampleParms(example));
        parms.putAll(getDESCRIPTIONExampleParms(example));
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int selectCountByExample(ScOptExample example) {
        Map parms = getExampleParms(example);
        int count = ((Integer)getSqlMapClientTemplate().queryForObject("sc_opt.abatorgenerated_selectCountByExample", parms)).intValue();
        return count;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public PageBox selectByExampleWithPaging(ScOptExample example, int pageSize, int pageNum, String orderByClause) {
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
            pageList = (getSqlMapClientTemplate().queryForList("sc_opt.abatorgenerated_selectByExample", parms, pageObject.getBeginIndex() - 1, pageSize));
        }
        pageBox.setPageObject(pageObject);
        pageBox.setPageList(pageList);
        return pageBox;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public PageBox selectByExampleWithPaging(ScOptExample example, int pageSize, int pageNum) {
        return selectByExampleWithPaging(example, pageSize, pageNum, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public int updateByPrimaryKeyForCgs(ScOpt record) {
        int rows = getSqlMapClientTemplate().update("sc_opt.abatorgenerated_updateByPrimaryKeyForCgs", record);
        return rows;
    }
}