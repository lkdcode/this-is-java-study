package designpattern.proxy;

public class Proxy implements IService {
    IService iService;

    @Override
    public String runSomething() {
        iService = new Service();
        return iService.runSomething();
    }
}
