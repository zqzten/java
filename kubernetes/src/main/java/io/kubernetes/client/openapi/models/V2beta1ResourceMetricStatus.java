/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as
 * specified in requests and limits, describing each pod in the current scale target (e.g. CPU or
 * memory). Such metrics are built in to Kubernetes, and have special scaling options on top of
 * those available to normal per-pod metrics using the \&quot;pods\&quot; source.
 */
@ApiModel(
    description =
        "ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the \"pods\" source.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-04-08T04:59:41.589Z[Etc/UTC]")
public class V2beta1ResourceMetricStatus {
  public static final String SERIALIZED_NAME_CURRENT_AVERAGE_UTILIZATION =
      "currentAverageUtilization";

  @SerializedName(SERIALIZED_NAME_CURRENT_AVERAGE_UTILIZATION)
  private Integer currentAverageUtilization;

  public static final String SERIALIZED_NAME_CURRENT_AVERAGE_VALUE = "currentAverageValue";

  @SerializedName(SERIALIZED_NAME_CURRENT_AVERAGE_VALUE)
  private Quantity currentAverageValue;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public V2beta1ResourceMetricStatus currentAverageUtilization(Integer currentAverageUtilization) {

    this.currentAverageUtilization = currentAverageUtilization;
    return this;
  }

  /**
   * currentAverageUtilization is the current value of the average of the resource metric across all
   * relevant pods, represented as a percentage of the requested value of the resource for the pods.
   * It will only be present if &#x60;targetAverageValue&#x60; was set in the corresponding metric
   * specification.
   *
   * @return currentAverageUtilization
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.")
  public Integer getCurrentAverageUtilization() {
    return currentAverageUtilization;
  }

  public void setCurrentAverageUtilization(Integer currentAverageUtilization) {
    this.currentAverageUtilization = currentAverageUtilization;
  }

  public V2beta1ResourceMetricStatus currentAverageValue(Quantity currentAverageValue) {

    this.currentAverageValue = currentAverageValue;
    return this;
  }

  /**
   * Quantity is a fixed-point representation of a number. It provides convenient
   * marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors. The
   * serialization format is: &lt;quantity&gt; ::&#x3D; &lt;signedNumber&gt;&lt;suffix&gt; (Note
   * that &lt;suffix&gt; may be empty, from the \&quot;\&quot; case in &lt;decimalSI&gt;.)
   * &lt;digit&gt; ::&#x3D; 0 | 1 | ... | 9 &lt;digits&gt; ::&#x3D; &lt;digit&gt; |
   * &lt;digit&gt;&lt;digits&gt; &lt;number&gt; ::&#x3D; &lt;digits&gt; |
   * &lt;digits&gt;.&lt;digits&gt; | &lt;digits&gt;. | .&lt;digits&gt; &lt;sign&gt; ::&#x3D;
   * \&quot;+\&quot; | \&quot;-\&quot; &lt;signedNumber&gt; ::&#x3D; &lt;number&gt; |
   * &lt;sign&gt;&lt;number&gt; &lt;suffix&gt; ::&#x3D; &lt;binarySI&gt; | &lt;decimalExponent&gt; |
   * &lt;decimalSI&gt; &lt;binarySI&gt; ::&#x3D; Ki | Mi | Gi | Ti | Pi | Ei (International System
   * of units; See: http://physics.nist.gov/cuu/Units/binary.html) &lt;decimalSI&gt; ::&#x3D; m |
   * \&quot;\&quot; | k | M | G | T | P | E (Note that 1024 &#x3D; 1Ki but 1000 &#x3D; 1k; I
   * didn&#39;t choose the capitalization.) &lt;decimalExponent&gt; ::&#x3D; \&quot;e\&quot;
   * &lt;signedNumber&gt; | \&quot;E\&quot; &lt;signedNumber&gt; No matter which of the three
   * exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude,
   * nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or
   * rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we
   * require larger or smaller quantities. When a Quantity is parsed from a string, it will remember
   * the type of suffix it had, and will use the same type again when it is serialized. Before
   * serializing, Quantity will be put in \&quot;canonical form\&quot;. This means that
   * Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in
   * Mantissa) such that: a. No precision is lost b. No fractional digits will be emitted c. The
   * exponent (or suffix) is as large as possible. The sign will be omitted unless the number is
   * negative. Examples: 1.5 will be serialized as \&quot;1500m\&quot; 1.5Gi will be serialized as
   * \&quot;1536Mi\&quot; Note that the quantity will NEVER be internally represented by a floating
   * point number. That is the whole point of this exercise. Non-canonical values will still parse
   * as long as they are well formed, but will be re-emitted in their canonical form. (So always use
   * canonical form, or don&#39;t diff.) This format is intended to make it difficult to use these
   * numbers without writing some sort of special handling code in the hopes that that will cause
   * implementors to also use a fixed point implementation.
   *
   * @return currentAverageValue
   */
  @ApiModelProperty(
      required = true,
      value =
          "Quantity is a fixed-point representation of a number. It provides convenient marshaling/unmarshaling in JSON and YAML, in addition to String() and AsInt64() accessors.  The serialization format is:  <quantity>        ::= <signedNumber><suffix>   (Note that <suffix> may be empty, from the \"\" case in <decimalSI>.) <digit>           ::= 0 | 1 | ... | 9 <digits>          ::= <digit> | <digit><digits> <number>          ::= <digits> | <digits>.<digits> | <digits>. | .<digits> <sign>            ::= \"+\" | \"-\" <signedNumber>    ::= <number> | <sign><number> <suffix>          ::= <binarySI> | <decimalExponent> | <decimalSI> <binarySI>        ::= Ki | Mi | Gi | Ti | Pi | Ei   (International System of units; See: http://physics.nist.gov/cuu/Units/binary.html) <decimalSI>       ::= m | \"\" | k | M | G | T | P | E   (Note that 1024 = 1Ki but 1000 = 1k; I didn't choose the capitalization.) <decimalExponent> ::= \"e\" <signedNumber> | \"E\" <signedNumber>  No matter which of the three exponent forms is used, no quantity may represent a number greater than 2^63-1 in magnitude, nor may it have more than 3 decimal places. Numbers larger or more precise will be capped or rounded up. (E.g.: 0.1m will rounded up to 1m.) This may be extended in the future if we require larger or smaller quantities.  When a Quantity is parsed from a string, it will remember the type of suffix it had, and will use the same type again when it is serialized.  Before serializing, Quantity will be put in \"canonical form\". This means that Exponent/suffix will be adjusted up or down (with a corresponding increase or decrease in Mantissa) such that:   a. No precision is lost   b. No fractional digits will be emitted   c. The exponent (or suffix) is as large as possible. The sign will be omitted unless the number is negative.  Examples:   1.5 will be serialized as \"1500m\"   1.5Gi will be serialized as \"1536Mi\"  Note that the quantity will NEVER be internally represented by a floating point number. That is the whole point of this exercise.  Non-canonical values will still parse as long as they are well formed, but will be re-emitted in their canonical form. (So always use canonical form, or don't diff.)  This format is intended to make it difficult to use these numbers without writing some sort of special handling code in the hopes that that will cause implementors to also use a fixed point implementation.")
  public Quantity getCurrentAverageValue() {
    return currentAverageValue;
  }

  public void setCurrentAverageValue(Quantity currentAverageValue) {
    this.currentAverageValue = currentAverageValue;
  }

  public V2beta1ResourceMetricStatus name(String name) {

    this.name = name;
    return this;
  }

  /**
   * name is the name of the resource in question.
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "name is the name of the resource in question.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta1ResourceMetricStatus v2beta1ResourceMetricStatus = (V2beta1ResourceMetricStatus) o;
    return Objects.equals(
            this.currentAverageUtilization, v2beta1ResourceMetricStatus.currentAverageUtilization)
        && Objects.equals(this.currentAverageValue, v2beta1ResourceMetricStatus.currentAverageValue)
        && Objects.equals(this.name, v2beta1ResourceMetricStatus.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentAverageUtilization, currentAverageValue, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1ResourceMetricStatus {\n");
    sb.append("    currentAverageUtilization: ")
        .append(toIndentedString(currentAverageUtilization))
        .append("\n");
    sb.append("    currentAverageValue: ")
        .append(toIndentedString(currentAverageValue))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
