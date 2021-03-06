package org.nodeclipse.debug.launch;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;


/**
 * Using "Run"-->"Run Configurations"--> "New Configuration"-- > "Run" will lead
 * here.
 **/
public class LaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

    @Override
    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { 
        		new LaunchConfigurationMainTab(),
        		new NodeArgumentsTab(),
        		new LaunchConfigurationEnvironmentTab(),
        		new CommonTab() 
        };
        setTabs(tabs);
    }
}
