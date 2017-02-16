/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.siddhi.query.api.expression.condition;

import org.wso2.siddhi.query.api.expression.Expression;

public class In extends Expression {

    private Expression expression;
    private String sourceId;

    public In(Expression expression, String sourceId) {
        this.expression = expression;
        this.sourceId = sourceId;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getSourceId() {
        return sourceId;
    }

    @Override
    public String toString() {
        return "In{" +
                "expression=" + expression +
                ", sourceId='" + sourceId + '\'' +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        In that = (In) o;

        if (expression != null ? !expression.equals(that.expression) : that.expression != null) {
            return false;
        }
        if (sourceId != null ? !sourceId.equals(that.sourceId) : that.sourceId != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = expression != null ? expression.hashCode() : 0;
        result = 31 * result + (sourceId != null ? sourceId.hashCode() : 0);
        return result;
    }

}