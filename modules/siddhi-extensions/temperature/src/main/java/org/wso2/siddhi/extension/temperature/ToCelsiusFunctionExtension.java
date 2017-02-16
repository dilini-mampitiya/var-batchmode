package org.wso2.siddhi.extension.temperature;

import org.wso2.siddhi.core.config.ExecutionPlanContext;
import org.wso2.siddhi.core.exception.ExecutionPlanRuntimeException;
import org.wso2.siddhi.core.executor.ExpressionExecutor;
import org.wso2.siddhi.core.executor.function.FunctionExecutor;
import org.wso2.siddhi.query.api.definition.Attribute;
import org.wso2.siddhi.query.api.exception.ExecutionPlanValidationException;

/**
 * Created by dilini92 on 6/16/16.
 */
public class ToCelsiusFunctionExtension extends FunctionExecutor {
    @Override
    protected void init(ExpressionExecutor[] attributeExpressionExecutors, ExecutionPlanContext executionPlanContext) {
        if (attributeExpressionExecutors.length != 1) {
            throw new ExecutionPlanValidationException("Invalid no of arguments passed to math:sin() function, " +
                    "required 1, but found " + attributeExpressionExecutors.length);
        }
        Attribute.Type attributeType = attributeExpressionExecutors[0].getReturnType();
        if (!((attributeType == Attribute.Type.INT))) {
            throw new ExecutionPlanValidationException("Invalid parameter type found for the argument of math:sin() function, " +
                    "required " + Attribute.Type.INT + ", but found " + attributeType.toString());
        }
    }

    @Override
    protected Object execute(Object[] data) {
        return null;
    }

    @Override
    protected Object execute(Object data) {
        if (data != null) {
            //type-conversion
            if (data instanceof Integer) {
                int inputInt = (Integer) data;
                return (inputInt - 32) * 5 / 9;
            }
        } else {
            throw new ExecutionPlanRuntimeException("Input to the math:celsius() function cannot be null");
        }
        return null;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public Attribute.Type getReturnType() {
        return Attribute.Type.INT;
    }

    @Override
    public Object[] currentState() {
        return null;
    }

    @Override
    public void restoreState(Object[] state) {

    }
}
