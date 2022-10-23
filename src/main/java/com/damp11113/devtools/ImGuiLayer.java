package com.damp11113.devtools;

import imgui.ImGui;

public class ImGuiLayer {

    private boolean showText = false;

    public void imgui() {
        ImGui.begin("Coll Window");

        if (ImGui.button("I am a Button")) {
            showText = true;
        }

        if (showText) {
            ImGui.text("You clicked a Button");
            ImGui.sameLine();
            if (ImGui.button("Stop showing text")) {
                showText = false;
            }
        }

        ImGui.end();
    }
}
