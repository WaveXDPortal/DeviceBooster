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
import com.wavemaker.device_booster.createQODSession.model.Response0;
/**
 * ResponseRanges
 */

public class ResponseRanges {
  @JsonProperty("0")
  private Response0 _0 = null;

  public ResponseRanges _0(Response0 _0) {
    this._0 = _0;
    return this;
  }

   /**
   * Get _0
   * @return _0
  **/
  public Response0 get0() {
    return _0;
  }

  public void set0(Response0 _0) {
    this._0 = _0;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRanges Response_ranges = (ResponseRanges) o;
    return Objects.equals(this._0, Response_ranges._0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_0);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRanges {\n");
    
    sb.append("    _0: ").append(toIndentedString(_0)).append("\n");
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
