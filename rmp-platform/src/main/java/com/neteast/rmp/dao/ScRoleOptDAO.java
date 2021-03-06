package com.neteast.rmp.dao;

import com.neteast.rmp.dao.domain.ScRoleOpt;
import com.neteast.rmp.dao.domain.ScRoleOptExample;
import com.seraph.bi.suite.support.domain.pagination.PageBox;
import java.util.List;

public interface ScRoleOptDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    Integer insert(ScRoleOpt record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int updateByPrimaryKey(ScRoleOpt record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int updateByPrimaryKeySelective(ScRoleOpt record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    List selectByExample(ScRoleOptExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    List selectByExample(ScRoleOptExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    ScRoleOpt selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int deleteByExample(ScRoleOptExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int selectCountByExample(ScRoleOptExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    PageBox selectByExampleWithPaging(ScRoleOptExample example, int pageSize, int pageNum, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    PageBox selectByExampleWithPaging(ScRoleOptExample example, int pageSize, int pageNum);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_role_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int updateByPrimaryKeyForCgs(ScRoleOpt record);
}