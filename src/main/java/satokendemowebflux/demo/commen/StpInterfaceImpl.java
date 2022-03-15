package satokendemowebflux.demo.commen;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;

/**
 * @Author GuoQi
 * @Date 2022/3/8 14:19
 * @Version 1.0
 *
 */
@Component
public class StpInterfaceImpl implements StpInterface {//实现StpInterface接口重写校验权限角色方法
    @Override
    public List<String> getPermissionList(Object loginId, String loginType) {
        List<String> permissionList = new ArrayList<>();
        permissionList.add("user-*");
        /*permissionList.add("user-update");
        permissionList.add("user-select");
        permissionList.add("user-delete");*/
        permissionList.add("article-get");
        return permissionList;
    }

    @Override
    public List<String> getRoleList(Object loginId, String loginType) {
        List<String> roleList = new ArrayList<>();
        roleList.add("admin");
        roleList.add("super-admin");
        roleList.add("consumer");
        return roleList;
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }
}
