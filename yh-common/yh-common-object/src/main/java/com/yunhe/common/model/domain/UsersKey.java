package com.yunhe.common.model.domain;

public class UsersKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.USERNAME
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    private String username;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.USERNAME
     *
     * @return the value of users.USERNAME
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.USERNAME
     *
     * @param username the value for users.USERNAME
     *
     * @mbg.generated Mon Jan 11 12:58:19 CST 2021
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}