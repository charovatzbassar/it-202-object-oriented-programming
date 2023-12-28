package week13.lab.problem4;

public class DeviceAdapter implements NewDevice {
    private OldDeviceImpl oldDevice;

    public DeviceAdapter(OldDeviceImpl oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void operateNewFunction() {
        System.out.println("New function");
    }
}
