package chillz.staffchat.sweetsmpsc;

import chillz.staffchat.sweetsmpsc.commands.ModChat;
import chillz.staffchat.sweetsmpsc.commands.SeniorChat;
import chillz.staffchat.sweetsmpsc.commands.StaffChat;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class SweetSMPSc extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("SweetSMP StaffChat enabled");
        Objects.requireNonNull(getCommand("staffchat")).setExecutor(new StaffChat());
        Objects.requireNonNull(getCommand("sc")).setExecutor(new StaffChat());
        Objects.requireNonNull(getCommand("modchat")).setExecutor(new ModChat());
        Objects.requireNonNull(getCommand("mc")).setExecutor(new ModChat());
        Objects.requireNonNull(getCommand("seniorchat")).setExecutor(new SeniorChat());
        Objects.requireNonNull(getCommand("sec")).setExecutor(new SeniorChat());

    }

    @Override
    public void onDisable() {
        System.out.println("SweetSMP StaffChat disabled");
    }
}
