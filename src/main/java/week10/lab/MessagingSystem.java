package week10.lab;

public class MessagingSystem {
    @CanSendMessage
    @RequiresPermission(permissionLevel = PermissionLevel.USER)
    public void sendMessage(User user) {
        System.out.println("Not permitted");
    }

    @CanSendMessage
    @RequiresPermission(permissionLevel = PermissionLevel.ADMIN)
    public void sendMessage(Admin admin) {
        System.out.println("Message is sent by " + admin.getUsername());
    }
}
