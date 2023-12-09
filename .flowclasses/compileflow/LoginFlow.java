package compileflow;

import java.util.Map;
import com.alibaba.compileflow.engine.process.preruntime.generator.bean.BeanProvider;
import com.alibaba.compileflow.engine.common.util.DataType;
import java.util.HashMap;
import com.alibaba.compileflow.extension.util.VarUtils;
import com.alibaba.compileflow.engine.ProcessEngineFactory;
import com.alibaba.compileflow.engine.runtime.instance.ProcessInstance;
import java.lang.String;
import com.alibaba.compileflow.extension.executor.JavaExecutor;
import com.alibaba.compileflow.engine.common.util.ObjectFactory;

public class LoginFlow implements ProcessInstance {

    private java.util.Map flowVars = null;
    private java.util.Map vars = null;
    private com.alibaba.compileflow.extension.util.VarUtils varUtil = null;
    private java.util.Map result = null;

    public Map<String, Object> execute(Map<String, Object> _pContext) throws Exception {
        flowVars = (Map)DataType.transfer(_pContext.get("flowVars"), Map.class);
        vars = (Map)DataType.transfer(_pContext.get("vars"), Map.class);
        varUtil = (VarUtils)DataType.transfer(_pContext.get("varUtil"), VarUtils.class);
        
        //ServiceTask
        result = ((JavaExecutor)ObjectFactory.getInstance("com.alibaba.compileflow.extension.executor.JavaExecutor")).execute((Map)DataType.transfer(flowVars, Map.class), (Map)DataType.transfer(vars, Map.class), "Activity_03nq4wk", "登录校验");
        
        return _wrapResult();
    }

    public Map<String, Object> _wrapResult() throws Exception {
        Map<String, Object> _pResult = new HashMap<>();
        _pResult.put("result", result);
        return _pResult;
    }

}