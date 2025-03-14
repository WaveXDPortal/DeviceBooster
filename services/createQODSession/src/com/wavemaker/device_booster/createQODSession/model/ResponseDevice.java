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
import com.wavemaker.device_booster.createQODSession.model.ResponseIpv4Address;
import com.wavemaker.device_booster.createQODSession.model.ResponsePhoneNumber;
/**
 * ResponseDevice
 */

public class ResponseDevice {
  @JsonProperty("phoneNumber")
  private ResponsePhoneNumber phoneNumber = null;

  @JsonProperty("ipv6Address")
  private String ipv6Address = null;

  @JsonProperty("ipv4Address")
  private ResponseIpv4Address ipv4Address = null;

  @JsonProperty("networkAccessIdentifier")
  private String networkAccessIdentifier = null;

  public ResponseDevice phoneNumber(ResponsePhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  public ResponsePhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(ResponsePhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public ResponseDevice ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

   /**
   * Get ipv6Address
   * @return ipv6Address
  **/
  public String getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  public ResponseDevice ipv4Address(ResponseIpv4Address ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

   /**
   * Get ipv4Address
   * @return ipv4Address
  **/
  public ResponseIpv4Address getIpv4Address() {
    return ipv4Address;
  }

  public void setIpv4Address(ResponseIpv4Address ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  public ResponseDevice networkAccessIdentifier(String networkAccessIdentifier) {
    this.networkAccessIdentifier = networkAccessIdentifier;
    return this;
  }

   /**
   * Get networkAccessIdentifier
   * @return networkAccessIdentifier
  **/
  public String getNetworkAccessIdentifier() {
    return networkAccessIdentifier;
  }

  public void setNetworkAccessIdentifier(String networkAccessIdentifier) {
    this.networkAccessIdentifier = networkAccessIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDevice Response_device = (ResponseDevice) o;
    return Objects.equals(this.phoneNumber, Response_device.phoneNumber) &&
        Objects.equals(this.ipv6Address, Response_device.ipv6Address) &&
        Objects.equals(this.ipv4Address, Response_device.ipv4Address) &&
        Objects.equals(this.networkAccessIdentifier, Response_device.networkAccessIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, ipv6Address, ipv4Address, networkAccessIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDevice {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    networkAccessIdentifier: ").append(toIndentedString(networkAccessIdentifier)).append("\n");
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
