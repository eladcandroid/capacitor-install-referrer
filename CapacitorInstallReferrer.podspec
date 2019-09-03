
  Pod::Spec.new do |s|
    s.name = 'CapacitorInstallReferrer'
    s.version = '0.0.1'
    s.summary = 'Capacitor Install Referrer Plugin'
    s.license = 'MIT'
    s.homepage = 'https://github.com/eladcandroid/capacitor-install-referrer.git'
    s.author = 'Elad Cohen'
    s.source = { :git => 'https://github.com/eladcandroid/capacitor-install-referrer.git', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end