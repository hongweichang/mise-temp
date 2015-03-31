package com.neteast.rmp.dao.domain;

import com.seraph.bi.suite.support.domain.annotations.PrimaryKey;

public class ScRoleOpt {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column sc_role_opt.ID
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    @PrimaryKey
    private Integer id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column sc_role_opt.ROLE_NAME
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private String roleName;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column sc_role_opt.OPT_CODE
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private String optCode;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column sc_role_opt.ID
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    private Integer id_old;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column sc_role_opt.ID
     *
     * @return the value of sc_role_opt.ID
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column sc_role_opt.ID
     *
     * @param id the value for sc_role_opt.ID
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column sc_role_opt.ROLE_NAME
     *
     * @return the value of sc_role_opt.ROLE_NAME
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column sc_role_opt.ROLE_NAME
     *
     * @param roleName the value for sc_role_opt.ROLE_NAME
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column sc_role_opt.OPT_CODE
     *
     * @return the value of sc_role_opt.OPT_CODE
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public String getOptCode() {
        return optCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column sc_role_opt.OPT_CODE
     *
     * @param optCode the value for sc_role_opt.OPT_CODE
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public void setOptCode(String optCode) {
        this.optCode = optCode;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column sc_role_opt.ID
     *
     * @return the value of sc_role_opt.ID
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public Integer getId_old() {
        return id_old;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column sc_role_opt.ID
     *
     * @param id_old the value for sc_role_opt.ID
     *
     * @abatorgenerated Tue Sep 20 22:24:44 CST 2011
     */
    public void setId_old(Integer id_old) {
        this.id_old = id_old;
    }
}