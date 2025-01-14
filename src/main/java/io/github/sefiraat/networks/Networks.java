package io.github.sefiraat.networks;

import io.github.sefiraat.networks.managers.ListenerManager;
import io.github.sefiraat.networks.managers.RunnableManager;
import io.github.sefiraat.networks.managers.SupportedPluginManager;
import io.github.sefiraat.networks.network.NetworkRoot;
import io.github.sefiraat.networks.network.NodeType;
import io.github.sefiraat.networks.slimefun.NetworkSlimefunItems;
import io.github.sefiraat.networks.slimefun.network.NetworkController;
import io.github.sefiraat.networks.slimefun.tools.NetworkCard;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import org.bstats.bukkit.Metrics;
import org.bstats.charts.AdvancedPie;
import org.bstats.charts.SimplePie;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class Networks extends JavaPlugin implements SlimefunAddon {


    private static Networks instance;

    private final String username;
    private final String repo;
    private final String branch;

    private ListenerManager listenerManager;
    private RunnableManager runnableManager;
    private SupportedPluginManager supportedPluginManager;

    public Networks() {
        this.username = "Sefiraat";
        this.repo = "Networks";
        this.branch = "master";
    }

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("########################################");
        getLogger().info("         Networks - By Sefiraat         ");
        getLogger().info("########################################");

        tryUpdate();

        setupSlimefun();

        this.listenerManager = new ListenerManager();
        this.runnableManager = new RunnableManager();
        this.supportedPluginManager = new SupportedPluginManager();

        setupMetrics();
    }

    public void tryUpdate() {
        if (getConfig().getBoolean("auto-update")
            && getDescription().getVersion().startsWith("DEV")
        ) {
            String updateLocation = MessageFormat.format("{0}/{1}/{2}", this.username, this.repo, this.branch);
            GitHubBuildsUpdater updater = new GitHubBuildsUpdater(this, getFile(), updateLocation);
            updater.start();
        }
    }

    public void setupSlimefun() {
        NetworkSlimefunItems.setup();
    }

    public void setupMetrics() {
        final Metrics metrics = new Metrics(this, 13644);

        AdvancedPie networksChart = new AdvancedPie("networks", () -> {
            Map<String, Integer> networksMap = new HashMap<>();
            networksMap.put("Number of networks", NetworkController.NETWORKS.size());
            return networksMap;
        });

        metrics.addCustomChart(networksChart);
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Nullable
    @Override
    public String getBugTrackerURL() {
        return MessageFormat.format("https://github.com/{0}/{1}/issues/", this.username, this.repo);
    }

    @Nonnull
    public static PluginManager getPluginManager() {
        return Networks.getInstance().getServer().getPluginManager();
    }

    public static Networks getInstance() {
        return Networks.instance;
    }

    public static SupportedPluginManager getSupportedPluginManager() {
        return Networks.getInstance().supportedPluginManager;
    }
}
