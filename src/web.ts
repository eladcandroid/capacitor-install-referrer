import { WebPlugin } from '@capacitor/core';
import { CapacitorInstallReferrerPlugin } from './definitions';

export class CapacitorInstallReferrerWeb extends WebPlugin implements CapacitorInstallReferrerPlugin {
  constructor() {
    super({
      name: 'CapacitorInstallReferrer',
      platforms: ['web']
    });
  }

  async echo(options: { value: string }): Promise<{value: string}> {
    console.log('ECHO', options);
    return options;
  }
}

const CapacitorInstallReferrer = new CapacitorInstallReferrerWeb();

export { CapacitorInstallReferrer };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(CapacitorInstallReferrer);
