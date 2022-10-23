package com.damp11113.devtools;

import com.mojang.logging.LogUtils;
import imgui.ImGui;
import org.slf4j.Logger;
import net.minecraft.client.MinecraftClient;

public class Window {
    private static final Logger LOGGER = LogUtils.getLogger();

    private ImGuiLayer imguiLayer;

    public Window(ImGuiLayer layer) {
        imguiLayer = layer;
    }

    public void init() {
        LOGGER.info("ImGUI starting!");
        try {
            initImGui();
        }
        catch (Exception e) {
            LOGGER.error("ImGUI failed to start!");
            return;
        }
        LOGGER.info("ImGUI started!");
    }

    private void initImGui() {
        ImGui.createContext();
    }

    public void run() {
        while (MinecraftClient.getInstance().isRunning()) {
            ImGui.newFrame();

            imguiLayer.imgui();

            ImGui.render();

        }
    }
}