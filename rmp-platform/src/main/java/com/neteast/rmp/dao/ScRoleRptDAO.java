package com.neteast.rmp.dao;

import com.neteast.rmp.dao.domain.ScRoleRpt;
import com.neteast.rmp.dao.domain.ScRoleRptExample;
import com.seraph.bi.suite.support.domain.pagination.PageBox;
import java.util.List;

public interface ScRoleRptDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    Integer insert(ScRoleRpt record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int updateByPrimaryKey(ScRoleRpt record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int updateByPrimaryKeySelective(ScRoleRpt record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    List selectByExample(ScRoleRptExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    List selectByExample(ScRoleRptExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    ScRoleRpt selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int deleteByExample(ScRoleRptExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int selectCountByExample(ScRoleRptExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    PageBox selectByExampleWithPaging(ScRoleRptExample example, int pageSize, int pageNum, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    PageBox selectByExampleWithPaging(ScRoleRptExample example, int pageSize, int pageNum);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_rpt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int updateByPrimaryKeyForCgs(ScRoleRpt record);
}