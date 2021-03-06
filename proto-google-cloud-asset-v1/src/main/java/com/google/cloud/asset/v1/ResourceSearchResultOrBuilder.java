/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/assets.proto

package com.google.cloud.asset.v1;

public interface ResourceSearchResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.ResourceSearchResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full resource name of this resource. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Cloud Asset Inventory Resource Name
   * Format](https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * for more information.
   * To search against the `name`:
   * * use a field query. Example: `name:instance1`
   * * use a free text query. Example: `instance1`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The full resource name of this resource. Example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Cloud Asset Inventory Resource Name
   * Format](https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * for more information.
   * To search against the `name`:
   * * use a field query. Example: `name:instance1`
   * * use a free text query. Example: `instance1`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The type of this resource. Example: `compute.googleapis.com/Disk`.
   * To search against the `asset_type`:
   * * specify the `asset_type` field in your search request.
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   *
   * @return The assetType.
   */
  java.lang.String getAssetType();
  /**
   *
   *
   * <pre>
   * The type of this resource. Example: `compute.googleapis.com/Disk`.
   * To search against the `asset_type`:
   * * specify the `asset_type` field in your search request.
   * </pre>
   *
   * <code>string asset_type = 2;</code>
   *
   * @return The bytes for assetType.
   */
  com.google.protobuf.ByteString getAssetTypeBytes();

  /**
   *
   *
   * <pre>
   * The project that this resource belongs to, in the form of
   * projects/{PROJECT_NUMBER}.
   * To search against the `project`:
   * * specify the `scope` field as this project in your search request.
   * </pre>
   *
   * <code>string project = 3;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The project that this resource belongs to, in the form of
   * projects/{PROJECT_NUMBER}.
   * To search against the `project`:
   * * specify the `scope` field as this project in your search request.
   * </pre>
   *
   * <code>string project = 3;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The display name of this resource.
   * To search against the `display_name`:
   * * use a field query. Example: `displayName:"My Instance"`
   * * use a free text query. Example: `"My Instance"`
   * </pre>
   *
   * <code>string display_name = 4;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of this resource.
   * To search against the `display_name`:
   * * use a field query. Example: `displayName:"My Instance"`
   * * use a free text query. Example: `"My Instance"`
   * </pre>
   *
   * <code>string display_name = 4;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * One or more paragraphs of text description of this resource. Maximum length
   * could be up to 1M bytes.
   * To search against the `description`:
   * * use a field query. Example: `description:"*important instance*"`
   * * use a free text query. Example: `"*important instance*"`
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * One or more paragraphs of text description of this resource. Maximum length
   * could be up to 1M bytes.
   * To search against the `description`:
   * * use a field query. Example: `description:"*important instance*"`
   * * use a free text query. Example: `"*important instance*"`
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Location can be `global`, regional like `us-east1`, or zonal like
   * `us-west1-b`.
   * To search against the `location`:
   * * use a field query. Example: `location:us-west*`
   * * use a free text query. Example: `us-west*`
   * </pre>
   *
   * <code>string location = 6;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * Location can be `global`, regional like `us-east1`, or zonal like
   * `us-west1-b`.
   * To search against the `location`:
   * * use a field query. Example: `location:us-west*`
   * * use a free text query. Example: `us-west*`
   * </pre>
   *
   * <code>string location = 6;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Labels associated with this resource. See [Labelling and grouping GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources)
   * for more information.
   * To search against the `labels`:
   * * use a field query:
   *     - query on any label's key or value. Example: `labels:prod`
   *     - query by a given label. Example: `labels.env:prod`
   *     - query by a given label's existence. Example: `labels.env:*`
   * * use a free text query. Example: `prod`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource. See [Labelling and grouping GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources)
   * for more information.
   * To search against the `labels`:
   * * use a field query:
   *     - query on any label's key or value. Example: `labels:prod`
   *     - query by a given label. Example: `labels.env:prod`
   *     - query by a given label's existence. Example: `labels.env:*`
   * * use a free text query. Example: `prod`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource. See [Labelling and grouping GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources)
   * for more information.
   * To search against the `labels`:
   * * use a field query:
   *     - query on any label's key or value. Example: `labels:prod`
   *     - query by a given label. Example: `labels.env:prod`
   *     - query by a given label's existence. Example: `labels.env:*`
   * * use a free text query. Example: `prod`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels associated with this resource. See [Labelling and grouping GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources)
   * for more information.
   * To search against the `labels`:
   * * use a field query:
   *     - query on any label's key or value. Example: `labels:prod`
   *     - query by a given label. Example: `labels.env:prod`
   *     - query by a given label's existence. Example: `labels.env:*`
   * * use a free text query. Example: `prod`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels associated with this resource. See [Labelling and grouping GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources)
   * for more information.
   * To search against the `labels`:
   * * use a field query:
   *     - query on any label's key or value. Example: `labels:prod`
   *     - query by a given label. Example: `labels.env:prod`
   *     - query by a given label's existence. Example: `labels.env:*`
   * * use a free text query. Example: `prod`
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Network tags associated with this resource. Like labels, network tags are a
   * type of annotations used to group GCP resources. See [Labelling GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources)
   * for more information.
   * To search against the `network_tags`:
   * * use a field query. Example: `networkTags:internal`
   * * use a free text query. Example: `internal`
   * </pre>
   *
   * <code>repeated string network_tags = 8;</code>
   *
   * @return A list containing the networkTags.
   */
  java.util.List<java.lang.String> getNetworkTagsList();
  /**
   *
   *
   * <pre>
   * Network tags associated with this resource. Like labels, network tags are a
   * type of annotations used to group GCP resources. See [Labelling GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources)
   * for more information.
   * To search against the `network_tags`:
   * * use a field query. Example: `networkTags:internal`
   * * use a free text query. Example: `internal`
   * </pre>
   *
   * <code>repeated string network_tags = 8;</code>
   *
   * @return The count of networkTags.
   */
  int getNetworkTagsCount();
  /**
   *
   *
   * <pre>
   * Network tags associated with this resource. Like labels, network tags are a
   * type of annotations used to group GCP resources. See [Labelling GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources)
   * for more information.
   * To search against the `network_tags`:
   * * use a field query. Example: `networkTags:internal`
   * * use a free text query. Example: `internal`
   * </pre>
   *
   * <code>repeated string network_tags = 8;</code>
   *
   * @param index The index of the element to return.
   * @return The networkTags at the given index.
   */
  java.lang.String getNetworkTags(int index);
  /**
   *
   *
   * <pre>
   * Network tags associated with this resource. Like labels, network tags are a
   * type of annotations used to group GCP resources. See [Labelling GCP
   * resources](https://cloud.google.com/blog/products/gcp/labelling-and-grouping-your-google-cloud-platform-resources)
   * for more information.
   * To search against the `network_tags`:
   * * use a field query. Example: `networkTags:internal`
   * * use a free text query. Example: `internal`
   * </pre>
   *
   * <code>repeated string network_tags = 8;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the networkTags at the given index.
   */
  com.google.protobuf.ByteString getNetworkTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * The additional searchable attributes of this resource. The attributes may
   * vary from one resource type to another. Examples: `projectId` for Project,
   * `dnsName` for DNS ManagedZone. This field contains a subset of the resource
   * metadata fields that are returned by the List or Get APIs provided by the
   * corresponding GCP service (e.g., Compute Engine). see [API references and
   * supported searchable
   * attributes](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types)
   * for more information.
   * You can search values of these fields through free text search. However,
   * you should not consume the field programically as the field names and
   * values may change as the GCP service updates to a new incompatible API
   * version.
   * To search against the `additional_attributes`:
   * * use a free text query to match the attributes values. Example: to search
   *   `additional_attributes = { dnsName: "foobar" }`, you can issue a query
   *   `foobar`.
   * </pre>
   *
   * <code>.google.protobuf.Struct additional_attributes = 9;</code>
   *
   * @return Whether the additionalAttributes field is set.
   */
  boolean hasAdditionalAttributes();
  /**
   *
   *
   * <pre>
   * The additional searchable attributes of this resource. The attributes may
   * vary from one resource type to another. Examples: `projectId` for Project,
   * `dnsName` for DNS ManagedZone. This field contains a subset of the resource
   * metadata fields that are returned by the List or Get APIs provided by the
   * corresponding GCP service (e.g., Compute Engine). see [API references and
   * supported searchable
   * attributes](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types)
   * for more information.
   * You can search values of these fields through free text search. However,
   * you should not consume the field programically as the field names and
   * values may change as the GCP service updates to a new incompatible API
   * version.
   * To search against the `additional_attributes`:
   * * use a free text query to match the attributes values. Example: to search
   *   `additional_attributes = { dnsName: "foobar" }`, you can issue a query
   *   `foobar`.
   * </pre>
   *
   * <code>.google.protobuf.Struct additional_attributes = 9;</code>
   *
   * @return The additionalAttributes.
   */
  com.google.protobuf.Struct getAdditionalAttributes();
  /**
   *
   *
   * <pre>
   * The additional searchable attributes of this resource. The attributes may
   * vary from one resource type to another. Examples: `projectId` for Project,
   * `dnsName` for DNS ManagedZone. This field contains a subset of the resource
   * metadata fields that are returned by the List or Get APIs provided by the
   * corresponding GCP service (e.g., Compute Engine). see [API references and
   * supported searchable
   * attributes](https://cloud.google.com/asset-inventory/docs/supported-asset-types#searchable_asset_types)
   * for more information.
   * You can search values of these fields through free text search. However,
   * you should not consume the field programically as the field names and
   * values may change as the GCP service updates to a new incompatible API
   * version.
   * To search against the `additional_attributes`:
   * * use a free text query to match the attributes values. Example: to search
   *   `additional_attributes = { dnsName: "foobar" }`, you can issue a query
   *   `foobar`.
   * </pre>
   *
   * <code>.google.protobuf.Struct additional_attributes = 9;</code>
   */
  com.google.protobuf.StructOrBuilder getAdditionalAttributesOrBuilder();
}
