package luolong.mybaties.generator.pojo;

import java.math.BigDecimal;
import java.util.Date;
import luolong.mybaties.generator.enums.OrderState;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.type
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Byte type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.app_id
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Integer appId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.batch_id
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Integer batchId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.order_no
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String orderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.order_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Date orderTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.money
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.order_state
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private OrderState orderState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.active_query
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Boolean activeQuery;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.notify_url
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String notifyUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.bank_card
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String bankCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.personal_name
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String personalName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.bank_no
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String bankNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.bank_name
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String bankName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.bank_mobile
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String bankMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.post_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Date postTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.channels
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String channels;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.channel_id
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Integer channelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.success_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Date successTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.ch_order_no
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String chOrderNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.extension
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String extension;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.last_resp_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Date lastRespTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.last_resp
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String lastResp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.notify_state
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private Byte notifyState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.path
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders_2018_1.properties
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    private String properties;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.type
     *
     * @return the value of orders_2018_1.type
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.type
     *
     * @param type the value for orders_2018_1.type
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.app_id
     *
     * @return the value of orders_2018_1.app_id
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.app_id
     *
     * @param appId the value for orders_2018_1.app_id
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.batch_id
     *
     * @return the value of orders_2018_1.batch_id
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Integer getBatchId() {
        return batchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.batch_id
     *
     * @param batchId the value for orders_2018_1.batch_id
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.order_no
     *
     * @return the value of orders_2018_1.order_no
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.order_no
     *
     * @param orderNo the value for orders_2018_1.order_no
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.order_time
     *
     * @return the value of orders_2018_1.order_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.order_time
     *
     * @param orderTime the value for orders_2018_1.order_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.money
     *
     * @return the value of orders_2018_1.money
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.money
     *
     * @param money the value for orders_2018_1.money
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.order_state
     *
     * @return the value of orders_2018_1.order_state
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public OrderState getOrderState() {
        return orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.order_state
     *
     * @param orderState the value for orders_2018_1.order_state
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.active_query
     *
     * @return the value of orders_2018_1.active_query
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Boolean getActiveQuery() {
        return activeQuery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.active_query
     *
     * @param activeQuery the value for orders_2018_1.active_query
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setActiveQuery(Boolean activeQuery) {
        this.activeQuery = activeQuery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.notify_url
     *
     * @return the value of orders_2018_1.notify_url
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.notify_url
     *
     * @param notifyUrl the value for orders_2018_1.notify_url
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.bank_card
     *
     * @return the value of orders_2018_1.bank_card
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getBankCard() {
        return bankCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.bank_card
     *
     * @param bankCard the value for orders_2018_1.bank_card
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.personal_name
     *
     * @return the value of orders_2018_1.personal_name
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getPersonalName() {
        return personalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.personal_name
     *
     * @param personalName the value for orders_2018_1.personal_name
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setPersonalName(String personalName) {
        this.personalName = personalName == null ? null : personalName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.bank_no
     *
     * @return the value of orders_2018_1.bank_no
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.bank_no
     *
     * @param bankNo the value for orders_2018_1.bank_no
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.bank_name
     *
     * @return the value of orders_2018_1.bank_name
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.bank_name
     *
     * @param bankName the value for orders_2018_1.bank_name
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.bank_mobile
     *
     * @return the value of orders_2018_1.bank_mobile
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getBankMobile() {
        return bankMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.bank_mobile
     *
     * @param bankMobile the value for orders_2018_1.bank_mobile
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setBankMobile(String bankMobile) {
        this.bankMobile = bankMobile == null ? null : bankMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.post_time
     *
     * @return the value of orders_2018_1.post_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Date getPostTime() {
        return postTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.post_time
     *
     * @param postTime the value for orders_2018_1.post_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.channels
     *
     * @return the value of orders_2018_1.channels
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getChannels() {
        return channels;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.channels
     *
     * @param channels the value for orders_2018_1.channels
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setChannels(String channels) {
        this.channels = channels == null ? null : channels.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.channel_id
     *
     * @return the value of orders_2018_1.channel_id
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.channel_id
     *
     * @param channelId the value for orders_2018_1.channel_id
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.success_time
     *
     * @return the value of orders_2018_1.success_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.success_time
     *
     * @param successTime the value for orders_2018_1.success_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.ch_order_no
     *
     * @return the value of orders_2018_1.ch_order_no
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getChOrderNo() {
        return chOrderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.ch_order_no
     *
     * @param chOrderNo the value for orders_2018_1.ch_order_no
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setChOrderNo(String chOrderNo) {
        this.chOrderNo = chOrderNo == null ? null : chOrderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.extension
     *
     * @return the value of orders_2018_1.extension
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getExtension() {
        return extension;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.extension
     *
     * @param extension the value for orders_2018_1.extension
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.last_resp_time
     *
     * @return the value of orders_2018_1.last_resp_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Date getLastRespTime() {
        return lastRespTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.last_resp_time
     *
     * @param lastRespTime the value for orders_2018_1.last_resp_time
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setLastRespTime(Date lastRespTime) {
        this.lastRespTime = lastRespTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.last_resp
     *
     * @return the value of orders_2018_1.last_resp
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getLastResp() {
        return lastResp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.last_resp
     *
     * @param lastResp the value for orders_2018_1.last_resp
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setLastResp(String lastResp) {
        this.lastResp = lastResp == null ? null : lastResp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.notify_state
     *
     * @return the value of orders_2018_1.notify_state
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public Byte getNotifyState() {
        return notifyState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.notify_state
     *
     * @param notifyState the value for orders_2018_1.notify_state
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setNotifyState(Byte notifyState) {
        this.notifyState = notifyState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.path
     *
     * @return the value of orders_2018_1.path
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.path
     *
     * @param path the value for orders_2018_1.path
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders_2018_1.properties
     *
     * @return the value of orders_2018_1.properties
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public String getProperties() {
        return properties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders_2018_1.properties
     *
     * @param properties the value for orders_2018_1.properties
     *
     * @mbg.generated Tue Jun 26 17:26:58 CST 2018
     */
    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }
}