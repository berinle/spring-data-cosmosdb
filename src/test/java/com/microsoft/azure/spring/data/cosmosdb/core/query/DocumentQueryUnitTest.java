/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.spring.data.cosmosdb.core.query;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

import static com.microsoft.azure.spring.data.cosmosdb.common.TestConstants.CRITERIA_KEY;
import static com.microsoft.azure.spring.data.cosmosdb.common.TestConstants.CRITERIA_OBJECT;

public class DocumentQueryUnitTest {

    @Test
    public void testDocumentQueryCreate() {
        final Criteria criteria = Criteria.getInstance(CriteriaType.IS_EQUAL, CRITERIA_KEY,
                Arrays.asList(CRITERIA_OBJECT));

        final DocumentQuery query = new DocumentQuery(criteria);

        Assert.assertEquals(query.getCriteria(), criteria);
        Assert.assertEquals(query.getSort(), Sort.unsorted());
        Assert.assertEquals(query.getPageable(), Pageable.unpaged());
    }
}
