package com.alicp.jetcache.anno.inittestbeans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created on 2017/5/5.
 *
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
@Component
public class AfterPropertiesSetTestBean extends InitTestBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        super.doTest();
    }
}
