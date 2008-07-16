require 'fileutils'
FileUtils.mkdir_p "downloads"
FileUtils.cd "downloads"

[
  "http://downloads.sourceforge.net/junit/junit4.4.zip?modtime=1184865442&big_mirror=0",
  "http://testng.org/testng-5.8.zip",
  "http://prdownloads.sourceforge.net/easymock/easymock2.4.zip",
  "http://easyb.googlecode.com/files/easyb-0.8.tar.gz"
].each do |uri|
  puts "Checking #{File.basename(uri)}"
  unless File.exist?(File.basename(uri))
    `wget #{uri}`
  end                   
end
