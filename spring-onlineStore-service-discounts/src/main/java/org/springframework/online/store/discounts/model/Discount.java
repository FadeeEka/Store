/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.online.store.discounts.model;

import org.springframework.core.style.ToStringCreator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "discount")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "item_id")
    @NotEmpty
    private Integer itemId;

    @Column(name = "discount")
    @NotEmpty
    private Integer discount;

    public Integer getId() {
        return id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Discount setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Integer getDiscount() {
        return discount;
    }

    public Discount setDiscount(Integer discount) {
        this.discount = discount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)

            .append("id", this.getId())
            .append("itemId", this.getItemId())
            .append("discount", this.getDiscount())
            .toString();
    }
}
