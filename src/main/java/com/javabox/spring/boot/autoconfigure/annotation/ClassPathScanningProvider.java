package com.javabox.spring.boot.autoconfigure.annotation;
import com.javabox.jar.LoadJar;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.stereotype.Component;
import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class ClassPathScanningProvider extends ClassPathScanningCandidateComponentProvider {

    @Autowired
    LoadJar loadJar;

    PathMatchingResourcePatternResolver resourcePatternResolver;

    @Override
    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        LinkedHashSet candidates = new LinkedHashSet();
        try {
            String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX +
                    resolveBasePackage(basePackage) + "/**/*.class";
            Resource[] resources = this.getResourcePatternResolver().getResources(packageSearchPath);
            boolean traceEnabled = this.logger.isTraceEnabled();
            boolean debugEnabled = this.logger.isDebugEnabled();
            Resource[] var7 = resources;
            int var8 = resources.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                Resource resource = var7[var9];
                if (traceEnabled) {
                    this.logger.trace("Scanning " + resource);
                }
                if (resource.isReadable()) {
                    try {
                        MetadataReader metadataReader = this.getMetadataReaderFactory().getMetadataReader(resource);
                       // if (this.isCandidateComponent(metadataReader)) {
                            ScannedGenericBeanDefinition sbd = new ScannedGenericBeanDefinition(metadataReader);
                            sbd.setResource(resource);
                            sbd.setSource(resource);
                            if (this.isCandidateComponent((AnnotatedBeanDefinition)sbd)) {
                                if (debugEnabled) {
                                    this.logger.debug("Identified candidate component class: " + resource);
                                }

                                candidates.add(sbd);
                            } else if (debugEnabled) {
                                this.logger.debug("Ignored because not a concrete top-level class: " + resource);
                            }
                      //  } else if (traceEnabled) {
                       //     this.logger.trace("Ignored because not matching any filter: " + resource);
                       // }
                    } catch (Throwable var13) {
                        throw new BeanDefinitionStoreException("Failed to read candidate component class: " + resource, var13);
                    }
                } else if (traceEnabled) {
                    this.logger.trace("Ignored because not readable: " + resource);
                }
            }
            return candidates;
        } catch (Exception var14) {
            throw new BeanDefinitionStoreException("I/O failure during classpath scanning", var14);
        }
    }

    private ResourcePatternResolver getResourcePatternResolver() throws Exception {
        if (this.resourcePatternResolver == null) {
            this.resourcePatternResolver = new PathMatchingResourcePatternResolver();
        }
        return this.resourcePatternResolver;
    }
}
