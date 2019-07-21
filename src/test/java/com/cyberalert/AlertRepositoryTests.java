/*
 * Copyright 2002-2016 the original author or authors.
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

package com.cyberalert;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.cyberalert.model.Alert;
import com.cyberalert.repo.AlertRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AlertRepositoryTests {

    @Autowired
    private TestEntityManager em;

    @Autowired
    private AlertRepository alertRepository;

    @Test
    public void testFindAll() {
        Alert alert = new Alert("Low", "No Action");
        em.persist(alert);

        List<Alert> alertList =  alertRepository.findAll();

        Assert.assertFalse(alertList.isEmpty());
    }
}