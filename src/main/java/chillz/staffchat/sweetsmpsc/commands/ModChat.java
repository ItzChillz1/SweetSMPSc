package chillz.staffchat.sweetsmpsc.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ModChat implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player p = (Player) sender;

        if (!p.hasPermission ("sweetsmp.modchat")) {
            p.sendMessage("§d§lSweet§f§lSMP &§You are not allowed to perform this command");
            return true;
        }

        String message = String.join(" ", args);

        if (message.equals("")) {
            p.sendMessage("§d§lSweet§f§lSMP §f/modchat <message>");
            return true;
        }

        for (Player staff : Bukkit.getOnlinePlayers()) {
            if (staff.hasPermission("sweetsmp.modchat")) {
                staff.sendMessage("§d§lMod§f§lChat §8> §f" + p.getName() + "§7: §f" + message);
            }
        }
        return false;

    }
}
