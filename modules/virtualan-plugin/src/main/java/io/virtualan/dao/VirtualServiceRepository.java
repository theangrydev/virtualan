/*
 * Copyright 2018 Virtualan Contributors (https://virtualan.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.virtualan.dao;

import java.util.Calendar;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import io.virtualan.entity.VirtualServiceEntity;


/**
 * This is Virtual Service Repository  bean.
 * 
 * @author  Elan Thangamani
 * 
 **/
@Repository
public interface VirtualServiceRepository extends PagingAndSortingRepository<VirtualServiceEntity, Long> {

    Iterable<VirtualServiceEntity> findByResourceAndOperationId(String resource, String operationId);
    Iterable<VirtualServiceEntity>  findByLastUsedDateTimeBefore(Calendar lastUsedDateTime);

}
