package jenkins.plugins.rpmsign;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

public class Rpm extends AbstractDescribableImpl<Rpm> {
  private final String gpgKeyName;
  private final String includes;
  private final String cmdlineOpts;
  private final boolean resign;
  private final int expectTimeout;

  @DataBoundConstructor
  public Rpm(String gpgKeyName, String includes, String cmdlineOpts, boolean resign, int expectTimeout) {
    this.gpgKeyName = gpgKeyName;
    this.includes = includes;
    this.resign = resign;
    this.cmdlineOpts = cmdlineOpts;
    this.expectTimeout = expectTimeout;
  }

  public String getGpgKeyName() {
    return gpgKeyName;
  }

  public String getIncludes() {
    return includes;
  }

  public String getCmdlineOpts() {
    return cmdlineOpts;
  }
    
  public boolean isResign() {
    return resign;
  }

  public Integer getExpectTimeout() {
    return expectTimeout;
  }
 
  @Extension
  public static class DescriptorImpl extends Descriptor<Rpm> {
    @Override
    public String getDisplayName() {
      return ""; // unused
    }
  }
}
