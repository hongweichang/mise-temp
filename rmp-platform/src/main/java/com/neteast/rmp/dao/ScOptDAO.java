package com.neteast.rmp.dao;

import com.neteast.rmp.dao.domain.ScOpt;
import com.neteast.rmp.dao.domain.ScOptExample;
import com.seraph.bi.suite.support.domain.pagination.PageBox;
import java.util.List;

public interface ScOptDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    Integer insert(ScOpt record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int updateByPrimaryKey(ScOpt record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int updateByPrimaryKeySelective(ScOpt record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    List selectByExample(ScOptExample example, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    List selectByExample(ScOptExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    ScOpt selectByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int deleteByExample(ScOptExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int selectCountByExample(ScOptExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    PageBox selectByExampleWithPaging(ScOptExample example, int pageSize, int pageNum, String orderByClause);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    PageBox selectByExampleWithPaging(ScOptExample example, int pageSize, int pageNum);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table sc_opt
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    int updateByPrimaryKeyForCgs(ScOpt record);
}