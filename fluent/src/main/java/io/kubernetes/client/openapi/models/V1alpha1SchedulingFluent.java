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

import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/** Generated */
public interface V1alpha1SchedulingFluent<A extends V1alpha1SchedulingFluent<A>> extends Fluent<A> {
  public A addToNodeSelector(String key, java.lang.String value);

  public A addToNodeSelector(Map<java.lang.String, java.lang.String> map);

  public A removeFromNodeSelector(java.lang.String key);

  public A removeFromNodeSelector(java.util.Map<java.lang.String, java.lang.String> map);

  public java.util.Map<java.lang.String, java.lang.String> getNodeSelector();

  public <K, V> A withNodeSelector(java.util.Map<java.lang.String, java.lang.String> nodeSelector);

  public Boolean hasNodeSelector();

  public A addToTolerations(Integer index, V1Toleration item);

  public A setToTolerations(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1Toleration item);

  public A addToTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);

  public A addAllToTolerations(Collection<io.kubernetes.client.openapi.models.V1Toleration> items);

  public A removeFromTolerations(io.kubernetes.client.openapi.models.V1Toleration... items);

  public A removeAllFromTolerations(
      java.util.Collection<io.kubernetes.client.openapi.models.V1Toleration> items);

  public A removeMatchingFromTolerations(Predicate<V1TolerationBuilder> predicate);

  /**
   * This method has been deprecated, please use method buildTolerations instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1Toleration> getTolerations();

  public java.util.List<io.kubernetes.client.openapi.models.V1Toleration> buildTolerations();

  public io.kubernetes.client.openapi.models.V1Toleration buildToleration(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1Toleration buildFirstToleration();

  public io.kubernetes.client.openapi.models.V1Toleration buildLastToleration();

  public io.kubernetes.client.openapi.models.V1Toleration buildMatchingToleration(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
          predicate);

  public java.lang.Boolean hasMatchingToleration(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
          predicate);

  public A withTolerations(
      java.util.List<io.kubernetes.client.openapi.models.V1Toleration> tolerations);

  public A withTolerations(io.kubernetes.client.openapi.models.V1Toleration... tolerations);

  public java.lang.Boolean hasTolerations();

  public V1alpha1SchedulingFluent.TolerationsNested<A> addNewToleration();

  public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A>
      addNewTolerationLike(io.kubernetes.client.openapi.models.V1Toleration item);

  public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A>
      setNewTolerationLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1Toleration item);

  public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A>
      editToleration(java.lang.Integer index);

  public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A>
      editFirstToleration();

  public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A>
      editLastToleration();

  public io.kubernetes.client.openapi.models.V1alpha1SchedulingFluent.TolerationsNested<A>
      editMatchingToleration(
          java.util.function.Predicate<io.kubernetes.client.openapi.models.V1TolerationBuilder>
              predicate);

  public interface TolerationsNested<N>
      extends Nested<N>, V1TolerationFluent<V1alpha1SchedulingFluent.TolerationsNested<N>> {
    public N and();

    public N endToleration();
  }
}
