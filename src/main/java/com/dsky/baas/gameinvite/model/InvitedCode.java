package com.dsky.baas.gameinvite.model;

public class InvitedCode {
	
	private String tablePostfix;
	
	
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_code_0.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_code_0.game_id
     *
     * @mbggenerated
     */
    private Integer gameId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_code_0.player_id
     *
     * @mbggenerated
     */
    private Integer playerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_code_0.device_id
     *
     * @mbggenerated
     */
    private String deviceId;

    private Integer actId;
    
    private Integer applyCount;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_code_0.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_code_0.create_at
     *
     * @mbggenerated
     */
    private Integer createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column invited_code_0.delete_at
     *
     * @mbggenerated
     */
    private Integer deleteAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_code_0.id
     *
     * @return the value of invited_code_0.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_code_0.id
     *
     * @param id the value for invited_code_0.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_code_0.game_id
     *
     * @return the value of invited_code_0.game_id
     *
     * @mbggenerated
     */
    public Integer getGameId() {
        return gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_code_0.game_id
     *
     * @param gameId the value for invited_code_0.game_id
     *
     * @mbggenerated
     */
    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_code_0.player_id
     *
     * @return the value of invited_code_0.player_id
     *
     * @mbggenerated
     */
    public Integer getPlayerId() {
        return playerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_code_0.player_id
     *
     * @param playerId the value for invited_code_0.player_id
     *
     * @mbggenerated
     */
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_code_0.device_id
     *
     * @return the value of invited_code_0.device_id
     *
     * @mbggenerated
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_code_0.device_id
     *
     * @param deviceId the value for invited_code_0.device_id
     *
     * @mbggenerated
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }
    
	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_code_0.code
     *
     * @return the value of invited_code_0.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_code_0.code
     *
     * @param code the value for invited_code_0.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_code_0.create_at
     *
     * @return the value of invited_code_0.create_at
     *
     * @mbggenerated
     */
    public Integer getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_code_0.create_at
     *
     * @param createAt the value for invited_code_0.create_at
     *
     * @mbggenerated
     */
    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column invited_code_0.delete_at
     *
     * @return the value of invited_code_0.delete_at
     *
     * @mbggenerated
     */
    public Integer getDeleteAt() {
        return deleteAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column invited_code_0.delete_at
     *
     * @param deleteAt the value for invited_code_0.delete_at
     *
     * @mbggenerated
     */
    public void setDeleteAt(Integer deleteAt) {
        this.deleteAt = deleteAt;
    }

	public String getTablePostfix() {
		return tablePostfix;
	}

	public void setTablePostfix(String tablePostfix) {
		this.tablePostfix = tablePostfix;
	}

	public Integer getApplyCount() {
		return applyCount;
	}

	public void setApplyCount(Integer applyCount) {
		this.applyCount = applyCount;
	}


}