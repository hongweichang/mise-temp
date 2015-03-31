package com.neteast.rmp.dao;

import com.neteast.rmp.dao.domain.ScPortalCfg;
import com.neteast.rmp.dao.domain.ScPortalCfgExample;
import com.seraph.bi.suite.support.domain.pagination.PageBox;
import java.util.List;

public interface ScPortalCfgDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    Integer insert(ScPortalCfg record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    int updateByPrimaryKey(ScPortalCfg record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    int updateByPrimaryKeySelective(ScPortalCfg record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    List selectByExample(ScPortalCfgExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    List selectByExample(ScPortalCfgExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    ScPortalCfg selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    int deleteByExample(ScPortalCfgExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    int selectCountByExample(ScPortalCfgExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    PageBox selectByExampleWithPaging(ScPortalCfgExample example, int pageSize, int pageNum, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    PageBox selectByExampleWithPaging(ScPortalCfgExample example, int pageSize, int pageNum);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_portal_cfg
     *
     * @abatorgenerated Tue Nov 06 18:51:05 CST 2012
     */
    int updateByPrimaryKeyForCgs(ScPortalCfg record);
}