package com.neteast.rmp.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.neteast.rmp.dao.ScHomepageCfgDAO;
import com.neteast.rmp.dao.domain.ScHomepageCfg;
import com.neteast.rmp.dao.domain.ScHomepageCfgExample;
import com.neteast.rmp.dao.ibatis.ext.BaseSqlMapClientDaoSupport;
import com.seraph.bi.suite.support.domain.pagination.PageBox;
import com.seraph.bi.suite.support.domain.pagination.PageObject;

@Repository
public class ScHomepageCfgDAOImpl extends BaseSqlMapClientDaoSupport implements ScHomepageCfgDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    public ScHomepageCfgDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    public Integer insert(ScHomepageCfg record) {
        Object newKey = getSqlMapClientTemplate().insert("sc_homepage_cfg.abatorgenerated_insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    public List selectByExample(ScHomepageCfgExample example, String orderByClause) {
        Map parms = getExampleParms(example);
        if (orderByClause != null) {
            parms.put("ABATOR_ORDER_BY_CLAUSE", orderByClause);
        }
        List list = getSqlMapClientTemplate().queryForList("sc_homepage_cfg.abatorgenerated_selectByExample", parms);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    public List selectByExample(ScHomepageCfgExample example) {
        return selectByExample(example, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    public int deleteByExample(ScHomepageCfgExample example) {
        int rows = getSqlMapClientTemplate().delete("sc_homepage_cfg.abatorgenerated_deleteByExample", getExampleParms(example));
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    private Map getIDExampleParms(ScHomepageCfgExample example) {
        Map parms = new HashMap();
        switch (example.getId_Indicator()) {
        case ScHomepageCfgExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_NULL", "Y");
            } else {
                parms.put("AND_ID_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_NOT_NULL", "Y");
            } else {
                parms.put("AND_ID_NOT_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_EQUALS", "Y");
            } else {
                parms.put("AND_ID_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_ID_NOT_EQUALS", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_GT", "Y");
            } else {
                parms.put("AND_ID_GT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_GE", "Y");
            } else {
                parms.put("AND_ID_GE", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ID_LT", "Y");
            } else {
                parms.put("AND_ID_LT", "Y");
            }
            parms.put("id", example.getId());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN_OR_EQUAL:
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
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    private Map getTITLEExampleParms(ScHomepageCfgExample example) {
        Map parms = new HashMap();
        switch (example.getTitle_Indicator()) {
        case ScHomepageCfgExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_TITLE_NULL", "Y");
            } else {
                parms.put("AND_TITLE_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_TITLE_NOT_NULL", "Y");
            } else {
                parms.put("AND_TITLE_NOT_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_TITLE_EQUALS", "Y");
            } else {
                parms.put("AND_TITLE_EQUALS", "Y");
            }
            parms.put("title", example.getTitle());
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_TITLE_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_TITLE_NOT_EQUALS", "Y");
            }
            parms.put("title", example.getTitle());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_TITLE_GT", "Y");
            } else {
                parms.put("AND_TITLE_GT", "Y");
            }
            parms.put("title", example.getTitle());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_TITLE_GE", "Y");
            } else {
                parms.put("AND_TITLE_GE", "Y");
            }
            parms.put("title", example.getTitle());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_TITLE_LT", "Y");
            } else {
                parms.put("AND_TITLE_LT", "Y");
            }
            parms.put("title", example.getTitle());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_TITLE_LE", "Y");
            } else {
                parms.put("AND_TITLE_LE", "Y");
            }
            parms.put("title", example.getTitle());
            break;
        case ScHomepageCfgExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_TITLE_LIKE", "Y");
            } else {
                parms.put("AND_TITLE_LIKE", "Y");
            }
            parms.put("title", example.getTitle());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    private Map getHREFExampleParms(ScHomepageCfgExample example) {
        Map parms = new HashMap();
        switch (example.getHref_Indicator()) {
        case ScHomepageCfgExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_HREF_NULL", "Y");
            } else {
                parms.put("AND_HREF_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_HREF_NOT_NULL", "Y");
            } else {
                parms.put("AND_HREF_NOT_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_HREF_EQUALS", "Y");
            } else {
                parms.put("AND_HREF_EQUALS", "Y");
            }
            parms.put("href", example.getHref());
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_HREF_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_HREF_NOT_EQUALS", "Y");
            }
            parms.put("href", example.getHref());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_HREF_GT", "Y");
            } else {
                parms.put("AND_HREF_GT", "Y");
            }
            parms.put("href", example.getHref());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_HREF_GE", "Y");
            } else {
                parms.put("AND_HREF_GE", "Y");
            }
            parms.put("href", example.getHref());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_HREF_LT", "Y");
            } else {
                parms.put("AND_HREF_LT", "Y");
            }
            parms.put("href", example.getHref());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_HREF_LE", "Y");
            } else {
                parms.put("AND_HREF_LE", "Y");
            }
            parms.put("href", example.getHref());
            break;
        case ScHomepageCfgExample.EXAMPLE_LIKE:
            if (example.isCombineTypeOr()) {
                parms.put("OR_HREF_LIKE", "Y");
            } else {
                parms.put("AND_HREF_LIKE", "Y");
            }
            parms.put("href", example.getHref());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    private Map getROW_NUMExampleParms(ScHomepageCfgExample example) {
        Map parms = new HashMap();
        switch (example.getRowNum_Indicator()) {
        case ScHomepageCfgExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_NUM_NULL", "Y");
            } else {
                parms.put("AND_ROW_NUM_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_NUM_NOT_NULL", "Y");
            } else {
                parms.put("AND_ROW_NUM_NOT_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_NUM_EQUALS", "Y");
            } else {
                parms.put("AND_ROW_NUM_EQUALS", "Y");
            }
            parms.put("rowNum", example.getRowNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_NUM_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_ROW_NUM_NOT_EQUALS", "Y");
            }
            parms.put("rowNum", example.getRowNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_NUM_GT", "Y");
            } else {
                parms.put("AND_ROW_NUM_GT", "Y");
            }
            parms.put("rowNum", example.getRowNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_NUM_GE", "Y");
            } else {
                parms.put("AND_ROW_NUM_GE", "Y");
            }
            parms.put("rowNum", example.getRowNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_NUM_LT", "Y");
            } else {
                parms.put("AND_ROW_NUM_LT", "Y");
            }
            parms.put("rowNum", example.getRowNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_ROW_NUM_LE", "Y");
            } else {
                parms.put("AND_ROW_NUM_LE", "Y");
            }
            parms.put("rowNum", example.getRowNum());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    private Map getCOL_NUMExampleParms(ScHomepageCfgExample example) {
        Map parms = new HashMap();
        switch (example.getColNum_Indicator()) {
        case ScHomepageCfgExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_NUM_NULL", "Y");
            } else {
                parms.put("AND_COL_NUM_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_NUM_NOT_NULL", "Y");
            } else {
                parms.put("AND_COL_NUM_NOT_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_NUM_EQUALS", "Y");
            } else {
                parms.put("AND_COL_NUM_EQUALS", "Y");
            }
            parms.put("colNum", example.getColNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_NUM_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_COL_NUM_NOT_EQUALS", "Y");
            }
            parms.put("colNum", example.getColNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_NUM_GT", "Y");
            } else {
                parms.put("AND_COL_NUM_GT", "Y");
            }
            parms.put("colNum", example.getColNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_NUM_GE", "Y");
            } else {
                parms.put("AND_COL_NUM_GE", "Y");
            }
            parms.put("colNum", example.getColNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_NUM_LT", "Y");
            } else {
                parms.put("AND_COL_NUM_LT", "Y");
            }
            parms.put("colNum", example.getColNum());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_COL_NUM_LE", "Y");
            } else {
                parms.put("AND_COL_NUM_LE", "Y");
            }
            parms.put("colNum", example.getColNum());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    private Map getSORTExampleParms(ScHomepageCfgExample example) {
        Map parms = new HashMap();
        switch (example.getSort_Indicator()) {
        case ScHomepageCfgExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_SORT_NULL", "Y");
            } else {
                parms.put("AND_SORT_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_SORT_NOT_NULL", "Y");
            } else {
                parms.put("AND_SORT_NOT_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_SORT_EQUALS", "Y");
            } else {
                parms.put("AND_SORT_EQUALS", "Y");
            }
            parms.put("sort", example.getSort());
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_SORT_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_SORT_NOT_EQUALS", "Y");
            }
            parms.put("sort", example.getSort());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_SORT_GT", "Y");
            } else {
                parms.put("AND_SORT_GT", "Y");
            }
            parms.put("sort", example.getSort());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_SORT_GE", "Y");
            } else {
                parms.put("AND_SORT_GE", "Y");
            }
            parms.put("sort", example.getSort());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_SORT_LT", "Y");
            } else {
                parms.put("AND_SORT_LT", "Y");
            }
            parms.put("sort", example.getSort());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_SORT_LE", "Y");
            } else {
                parms.put("AND_SORT_LE", "Y");
            }
            parms.put("sort", example.getSort());
            break;
        }
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    private Map getDESCRIPTIONExampleParms(ScHomepageCfgExample example) {
        Map parms = new HashMap();
        switch (example.getDescription_Indicator()) {
        case ScHomepageCfgExample.EXAMPLE_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_NULL", "Y");
            } else {
                parms.put("AND_DESCRIPTION_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_NULL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_NOT_NULL", "Y");
            } else {
                parms.put("AND_DESCRIPTION_NOT_NULL", "Y");
            }
            break;
        case ScHomepageCfgExample.EXAMPLE_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_EQUALS", "Y");
            } else {
                parms.put("AND_DESCRIPTION_EQUALS", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScHomepageCfgExample.EXAMPLE_NOT_EQUALS:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_NOT_EQUALS", "Y");
            } else {
                parms.put("AND_DESCRIPTION_NOT_EQUALS", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_GT", "Y");
            } else {
                parms.put("AND_DESCRIPTION_GT", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScHomepageCfgExample.EXAMPLE_GREATER_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_GE", "Y");
            } else {
                parms.put("AND_DESCRIPTION_GE", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_LT", "Y");
            } else {
                parms.put("AND_DESCRIPTION_LT", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScHomepageCfgExample.EXAMPLE_LESS_THAN_OR_EQUAL:
            if (example.isCombineTypeOr()) {
                parms.put("OR_DESCRIPTION_LE", "Y");
            } else {
                parms.put("AND_DESCRIPTION_LE", "Y");
            }
            parms.put("description", example.getDescription());
            break;
        case ScHomepageCfgExample.EXAMPLE_LIKE:
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
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    private Map getExampleParms(ScHomepageCfgExample example) {
        Map parms = new HashMap();
        parms.putAll(getIDExampleParms(example));
        parms.putAll(getTITLEExampleParms(example));
        parms.putAll(getHREFExampleParms(example));
        parms.putAll(getROW_NUMExampleParms(example));
        parms.putAll(getCOL_NUMExampleParms(example));
        parms.putAll(getSORTExampleParms(example));
        parms.putAll(getDESCRIPTIONExampleParms(example));
        return parms;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    public int selectCountByExample(ScHomepageCfgExample example) {
        Map parms = getExampleParms(example);
        int count = ((Integer)getSqlMapClientTemplate().queryForObject("sc_homepage_cfg.abatorgenerated_selectCountByExample", parms)).intValue();
        return count;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    public PageBox selectByExampleWithPaging(ScHomepageCfgExample example, int pageSize, int pageNum, String orderByClause) {
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
            pageList = (getSqlMapClientTemplate().queryForList("sc_homepage_cfg.abatorgenerated_selectByExample", parms, pageObject.getBeginIndex() - 1, pageSize));
        }
        pageBox.setPageObject(pageObject);
        pageBox.setPageList(pageList);
        return pageBox;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    public PageBox selectByExampleWithPaging(ScHomepageCfgExample example, int pageSize, int pageNum) {
        return selectByExampleWithPaging(example, pageSize, pageNum, null);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_homepage_cfg
     *
     * @abatorgenerated Tue Nov 06 14:43:17 CST 2012
     */
    public int updateByPrimaryKeyForCgs(ScHomepageCfg record) {
        int rows = getSqlMapClientTemplate().update("sc_homepage_cfg.abatorgenerated_updateByPrimaryKeyForCgs", record);
        return rows;
    }
}