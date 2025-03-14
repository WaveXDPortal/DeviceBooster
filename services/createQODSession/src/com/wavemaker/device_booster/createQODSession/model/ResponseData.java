/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.wavemaker.device_booster.createQODSession.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.wavemaker.device_booster.createQODSession.model.ResponseApplicationServer;
import com.wavemaker.device_booster.createQODSession.model.ResponseApplicationServerPorts;
import com.wavemaker.device_booster.createQODSession.model.ResponseDevice;
import com.wavemaker.device_booster.createQODSession.model.ResponseDevicePorts;
import com.wavemaker.device_booster.createQODSession.model.ResponseWebhook;
/**
 * ResponseData
 */

public class ResponseData {
  @JsonProperty("notificationUrl")
  private String notificationUrl = null;

  @JsonProperty("webhook")
  private ResponseWebhook webhook = null;

  @JsonProperty("applicationServerPorts")
  private ResponseApplicationServerPorts applicationServerPorts = null;

  @JsonProperty("startedAt")
  private String startedAt = null;

  @JsonProperty("sessionId")
  private String sessionId = null;

  @JsonProperty("expiresAt")
  private String expiresAt = null;

  @JsonProperty("devicePorts")
  private ResponseDevicePorts devicePorts = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("qosProfile")
  private String qosProfile = null;

  @JsonProperty("qosStatus")
  private String qosStatus = null;

  @JsonProperty("applicationServer")
  private ResponseApplicationServer applicationServer = null;

  @JsonProperty("notificationAuthToken")
  private String notificationAuthToken = null;

  @JsonProperty("device")
  private ResponseDevice device = null;

  public ResponseData notificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
    return this;
  }

   /**
   * Get notificationUrl
   * @return notificationUrl
  **/
  public String getNotificationUrl() {
    return notificationUrl;
  }

  public void setNotificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
  }

  public ResponseData webhook(ResponseWebhook webhook) {
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  public ResponseWebhook getWebhook() {
    return webhook;
  }

  public void setWebhook(ResponseWebhook webhook) {
    this.webhook = webhook;
  }

  public ResponseData applicationServerPorts(ResponseApplicationServerPorts applicationServerPorts) {
    this.applicationServerPorts = applicationServerPorts;
    return this;
  }

   /**
   * Get applicationServerPorts
   * @return applicationServerPorts
  **/
  public ResponseApplicationServerPorts getApplicationServerPorts() {
    return applicationServerPorts;
  }

  public void setApplicationServerPorts(ResponseApplicationServerPorts applicationServerPorts) {
    this.applicationServerPorts = applicationServerPorts;
  }

  public ResponseData startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }

  public ResponseData sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public ResponseData expiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  public String getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(String expiresAt) {
    this.expiresAt = expiresAt;
  }

  public ResponseData devicePorts(ResponseDevicePorts devicePorts) {
    this.devicePorts = devicePorts;
    return this;
  }

   /**
   * Get devicePorts
   * @return devicePorts
  **/
  public ResponseDevicePorts getDevicePorts() {
    return devicePorts;
  }

  public void setDevicePorts(ResponseDevicePorts devicePorts) {
    this.devicePorts = devicePorts;
  }

  public ResponseData duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public ResponseData qosProfile(String qosProfile) {
    this.qosProfile = qosProfile;
    return this;
  }

   /**
   * Get qosProfile
   * @return qosProfile
  **/
  public String getQosProfile() {
    return qosProfile;
  }

  public void setQosProfile(String qosProfile) {
    this.qosProfile = qosProfile;
  }

  public ResponseData qosStatus(String qosStatus) {
    this.qosStatus = qosStatus;
    return this;
  }

   /**
   * Get qosStatus
   * @return qosStatus
  **/
  public String getQosStatus() {
    return qosStatus;
  }

  public void setQosStatus(String qosStatus) {
    this.qosStatus = qosStatus;
  }

  public ResponseData applicationServer(ResponseApplicationServer applicationServer) {
    this.applicationServer = applicationServer;
    return this;
  }

   /**
   * Get applicationServer
   * @return applicationServer
  **/
  public ResponseApplicationServer getApplicationServer() {
    return applicationServer;
  }

  public void setApplicationServer(ResponseApplicationServer applicationServer) {
    this.applicationServer = applicationServer;
  }

  public ResponseData notificationAuthToken(String notificationAuthToken) {
    this.notificationAuthToken = notificationAuthToken;
    return this;
  }

   /**
   * Get notificationAuthToken
   * @return notificationAuthToken
  **/
  public String getNotificationAuthToken() {
    return notificationAuthToken;
  }

  public void setNotificationAuthToken(String notificationAuthToken) {
    this.notificationAuthToken = notificationAuthToken;
  }

  public ResponseData device(ResponseDevice device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  public ResponseDevice getDevice() {
    return device;
  }

  public void setDevice(ResponseDevice device) {
    this.device = device;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseData Response_data = (ResponseData) o;
    return Objects.equals(this.notificationUrl, Response_data.notificationUrl) &&
        Objects.equals(this.webhook, Response_data.webhook) &&
        Objects.equals(this.applicationServerPorts, Response_data.applicationServerPorts) &&
        Objects.equals(this.startedAt, Response_data.startedAt) &&
        Objects.equals(this.sessionId, Response_data.sessionId) &&
        Objects.equals(this.expiresAt, Response_data.expiresAt) &&
        Objects.equals(this.devicePorts, Response_data.devicePorts) &&
        Objects.equals(this.duration, Response_data.duration) &&
        Objects.equals(this.qosProfile, Response_data.qosProfile) &&
        Objects.equals(this.qosStatus, Response_data.qosStatus) &&
        Objects.equals(this.applicationServer, Response_data.applicationServer) &&
        Objects.equals(this.notificationAuthToken, Response_data.notificationAuthToken) &&
        Objects.equals(this.device, Response_data.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationUrl, webhook, applicationServerPorts, startedAt, sessionId, expiresAt, devicePorts, duration, qosProfile, qosStatus, applicationServer, notificationAuthToken, device);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseData {\n");
    
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    applicationServerPorts: ").append(toIndentedString(applicationServerPorts)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    devicePorts: ").append(toIndentedString(devicePorts)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    qosProfile: ").append(toIndentedString(qosProfile)).append("\n");
    sb.append("    qosStatus: ").append(toIndentedString(qosStatus)).append("\n");
    sb.append("    applicationServer: ").append(toIndentedString(applicationServer)).append("\n");
    sb.append("    notificationAuthToken: ").append(toIndentedString(notificationAuthToken)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
