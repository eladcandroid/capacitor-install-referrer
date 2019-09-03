declare module "@capacitor/core" {
  interface PluginRegistry {
    CapacitorInstallReferrer: CapacitorInstallReferrerPlugin;
  }
}

export interface CapacitorInstallReferrerPlugin {
  echo(options: { value: string }): Promise<{value: string}>;
}
