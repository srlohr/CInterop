#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface BuildConfigurationProvider : NSObject

@property (class, nonatomic, readonly) BuildConfigurationProvider *shared;
@property (nonatomic, readonly) NSString *apiBaseUrl;
@property (nonatomic, readonly) BOOL isDebug;

- (NSString *)getApiBaseUrl;

@end

NS_ASSUME_NONNULL_END
