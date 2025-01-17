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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AzureFile represents an Azure File Service mount on the host and bind mount to the pod. */
@ApiModel(
    description =
        "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-04-08T04:59:41.589Z[Etc/UTC]")
public class V1AzureFilePersistentVolumeSource {
  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";

  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";

  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_SECRET_NAMESPACE = "secretNamespace";

  @SerializedName(SERIALIZED_NAME_SECRET_NAMESPACE)
  private String secretNamespace;

  public static final String SERIALIZED_NAME_SHARE_NAME = "shareName";

  @SerializedName(SERIALIZED_NAME_SHARE_NAME)
  private String shareName;

  public V1AzureFilePersistentVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   *
   * @return readOnly
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public V1AzureFilePersistentVolumeSource secretName(String secretName) {

    this.secretName = secretName;
    return this;
  }

  /**
   * the name of secret that contains Azure Storage Account Name and Key
   *
   * @return secretName
   */
  @ApiModelProperty(
      required = true,
      value = "the name of secret that contains Azure Storage Account Name and Key")
  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  public V1AzureFilePersistentVolumeSource secretNamespace(String secretNamespace) {

    this.secretNamespace = secretNamespace;
    return this;
  }

  /**
   * the namespace of the secret that contains Azure Storage Account Name and Key default is the
   * same as the Pod
   *
   * @return secretNamespace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "the namespace of the secret that contains Azure Storage Account Name and Key default is the same as the Pod")
  public String getSecretNamespace() {
    return secretNamespace;
  }

  public void setSecretNamespace(String secretNamespace) {
    this.secretNamespace = secretNamespace;
  }

  public V1AzureFilePersistentVolumeSource shareName(String shareName) {

    this.shareName = shareName;
    return this;
  }

  /**
   * Share Name
   *
   * @return shareName
   */
  @ApiModelProperty(required = true, value = "Share Name")
  public String getShareName() {
    return shareName;
  }

  public void setShareName(String shareName) {
    this.shareName = shareName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1AzureFilePersistentVolumeSource v1AzureFilePersistentVolumeSource =
        (V1AzureFilePersistentVolumeSource) o;
    return Objects.equals(this.readOnly, v1AzureFilePersistentVolumeSource.readOnly)
        && Objects.equals(this.secretName, v1AzureFilePersistentVolumeSource.secretName)
        && Objects.equals(this.secretNamespace, v1AzureFilePersistentVolumeSource.secretNamespace)
        && Objects.equals(this.shareName, v1AzureFilePersistentVolumeSource.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readOnly, secretName, secretNamespace, shareName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AzureFilePersistentVolumeSource {\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    secretNamespace: ").append(toIndentedString(secretNamespace)).append("\n");
    sb.append("    shareName: ").append(toIndentedString(shareName)).append("\n");
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
