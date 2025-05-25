import Foundation

@objc(BuildConfigurationProvider)
public class BuildConfigurationProvider: NSObject {
    @objc public static let shared = BuildConfigurationProvider()
    @objc public let apiBaseUrl: String
    @objc public let isDebug: Bool

    @objc private override init() {
        #if DEBUG
        isDebug = true
        apiBaseUrl = "<https://ios-api-dev.example.org>"
        #else
        isDebug = false
        apiBaseUrl = "<https://ios-api.example.org>"
        #endif
        super.init()
    }
    
    @objc public func getApiBaseUrl() -> String {
        return apiBaseUrl
    }
}
