package com.neteast.rmp.dao;

import com.neteast.rmp.dao.domain.ScGlobalParm;
import com.neteast.rmp.dao.domain.ScGlobalParmExample;
import com.seraph.bi.suite.support.domain.pagination.PageBox;
import java.util.List;

public interface ScGlobalParmDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    Integer insert(ScGlobalParm record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    int updateByPrimaryKey(ScGlobalParm record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    int updateByPrimaryKeySelective(ScGlobalParm record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    List selectByExample(ScGlobalParmExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    List selectByExample(ScGlobalParmExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    ScGlobalParm selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    int deleteByExample(ScGlobalParmExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    int selectCountByExample(ScGlobalParmExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    PageBox selectByExampleWithPaging(ScGlobalParmExample example, int pageSize, int pageNum, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    PageBox selectByExampleWithPaging(ScGlobalParmExample example, int pageSize, int pageNum);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_global_parm
     *
     * @abatorgenerated Wed Oct 19 14:49:28 CST 2011
     */
    int updateByPrimaryKeyForCgs(ScGlobalParm record);
}