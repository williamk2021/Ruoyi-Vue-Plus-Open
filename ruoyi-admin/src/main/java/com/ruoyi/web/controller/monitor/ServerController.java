package com.ruoyi.web.controller.monitor;




import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.domain.server.Server;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务器监控
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/monitor/server")
public class ServerController
{

    @GetMapping()
    public R getInfo() throws Exception
    {
        Server server = new Server();
        server.copyTo();
        return R.ok(server);
    }
}
